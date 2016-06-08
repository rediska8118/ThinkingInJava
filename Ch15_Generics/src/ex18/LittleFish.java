package ex18;

import net.mindview.util.Generator;

public class LittleFish {

	private static long counter = 1;
	private final long id = counter++;

	private LittleFish() {
	}

	public String toString() {
		return "LittelFish " + id;
	}

	public static Generator<LittleFish> generator = new Generator<LittleFish>() {

		@Override
		public LittleFish next() {
			return new LittleFish();
		}
	};

}
