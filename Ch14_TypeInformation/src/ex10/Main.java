package ex10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
				
		List<Rodent> rodentList = new ArrayList<>();
		rodentList.add(new Mouse());
		rodentList.add(new Hamster());
		rodentList.add(new Mouse());
		rodentList.add(new Gerbil());
		rodentList.add(new Mouse());
		
		Iterator<Rodent> iter = rodentList.iterator();
		
		while(iter.hasNext()){
			iter.next().showAnimal();
		}
	}
}
