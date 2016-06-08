package ex18;

import net.mindview.util.Generator;

public class BigFish {

	private static long counter = 1;
	private final long id = counter++;

	private BigFish() {
	}

	public String toString() {
		return "BigFish " + id;
	}

	public static Generator<BigFish> generator() {
		return new Generator<BigFish>() {

			@Override
			public BigFish next() {
				return new BigFish();
			}
		};
	}

}
