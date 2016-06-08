package ex15;

import net.mindview.util.*;
import static ex15.Tuple.*;

public class TupleTest2 {

	static TwoTuple<String, Integer> f() {
		return tuple("hi", 47);
	}

	static TwoTuple f2() {
		return tuple("hi", 47);
	}

	static ThreeTuple<Object, String, Integer> g() {
		return tuple(new Object(), "hi", 47);
	}

	static FourTuple<Object, Object, String, Integer> h() {
		return tuple(new Object(), new Object(), "hi", 47);
	}

	static FiveTuple<Object, Object, String, Integer, Double> k() {
		return tuple(new Object(), new Object(), "hi", 47, 11.1);
	}

	public static void main(String[] args) {
		TwoTuple<String, Integer> ttsi = f();
		// compiler warning: unchecked conversion:
		TwoTuple<String, Integer> ttsi2 = f2();
		System.out.println(ttsi);
		System.out.println(f2());
		System.out.println(g());
		System.out.println(h());
		System.out.println(k());
	}
}
