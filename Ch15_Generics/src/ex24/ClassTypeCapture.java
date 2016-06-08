package ex24;

import java.util.HashMap;
import java.util.Map;

class Building {
}

class House extends Building {
}

interface Factory<T> {
	T create();
}

class BuildingFactory implements Factory<Building> {
	public Building create() {
		return new Building();
	}
}

class HouseFactory implements Factory<House> {
	public House create() {
		return new House();
	}
}

public class ClassTypeCapture<T> {
	Class<T> kind;
	Map<String, Factory> map;

	public ClassTypeCapture(Class<T> kind) {
		this.kind = kind;
	}

	public boolean f(Object arg) {
		return kind.isInstance(arg);
	}

	public void addType(String typename, Factory kind) {
		if (null == map)
			map = new HashMap<String, Factory>();
		map.put(typename, kind);
	}

	public Object createNew(String typename) throws InstantiationException,
			IllegalAccessException {
		if (map.containsKey(typename)) {
			return map.get(typename).create();
		}
		System.out.println("Class not available");
		return null;
	}

	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException {
		ClassTypeCapture<Building> ctt1 = new ClassTypeCapture<Building>(
				Building.class);
		System.out.println(ctt1.f(new Building()));
		System.out.println(ctt1.f(new House()));
		ClassTypeCapture<House> ctt2 = new ClassTypeCapture<House>(House.class);
		System.out.println(ctt2.f(new Building()));
		System.out.println(ctt2.f(new House()));

		System.out.println("================");
		ClassTypeCapture<Building> ctt3 = new ClassTypeCapture<Building>(
				Building.class);
		ctt3.addType("Building", new BuildingFactory());
		System.out.println(ctt3.createNew("House"));
		System.out.println(ctt3.createNew("Building"));

	}
}
