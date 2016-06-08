package ex30;

import ex29.Holder;

public class Main {

	static <T> void check(Holder<T> holder, T value) {
		holder.set(value);
		System.out.println(holder.get());
	}

	public static void main(String[] args) {
		check(new Holder<Integer>(), 123);
		check(new Holder<Float>(), 123.3f);
		short s = 32767;
		check(new Holder<Short>(), s);
		byte b = 127;
		check(new Holder<Byte>(), b);
		check(new Holder<Long>(), 123l);
		check(new Holder<Double>(), 123.3d);
		check(new Holder<Boolean>(), true);
		check(new Holder<Character>(), 'a');
	}
}
