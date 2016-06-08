package ex03;

import net.mindview.util.FiveTuple;

public class SixTuple<A, B, C, D, E, F> extends FiveTuple<A, B, C, D, E> {

	public final F six;

	public SixTuple(A a, B b, C c, D d, E e, F six) {
		super(a, b, c, d, e);
		this.six = six;
	}

	public String toString() {
		return "(" + first + ", " + second + ", " + third + ", " + fourth
				+ ", " + fifth + ", " + six + ")";
	}

}
