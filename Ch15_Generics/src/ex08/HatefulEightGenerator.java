package ex08;

import java.util.Iterator;
import java.util.Random;

import net.mindview.util.Generator;

public class HatefulEightGenerator implements
		Generator<HatefulEightCharacters>, Iterable<HatefulEightCharacters> {

	private Class[] types = { DemianBichir.class, JenniferJasonLeigh.class,
			KurtRussel.class, MichaelMadsen.class, SamuelLJackson.class,
			TimRoth.class, WaltonGoggins.class };

	private static Random rand = new Random(47);

	public HatefulEightGenerator() {
	}

	private int size = 0;

	public HatefulEightGenerator(int size) {
		this.size = size;
	}

	@Override
	public HatefulEightCharacters next() {

		try {
			return (HatefulEightCharacters) types[rand.nextInt(types.length)].newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	class HatefulEightIterator implements Iterator<HatefulEightCharacters> {

		int count = size;

		@Override
		public boolean hasNext() {
			return count > 0;
		}

		@Override
		public HatefulEightCharacters next() {
			count--;
			return HatefulEightGenerator.this.next();
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public Iterator<HatefulEightCharacters> iterator() {
		return new HatefulEightIterator();
	}

	public static void main(String[] args) {
		HatefulEightGenerator generator = new HatefulEightGenerator();

		for (int i = 0; i < 5; i++)
			System.out.println(generator.next());

		for (HatefulEightCharacters characters : new HatefulEightGenerator(5))
			System.out.println(characters);
	}

}
