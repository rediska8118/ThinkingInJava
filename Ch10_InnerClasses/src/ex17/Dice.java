package ex17;

import java.util.Random;

public class Dice implements IGame {

	Random rand = new Random();

	@Override
	public void toss() {
		// TODO Auto-generated method stub
		System.out.println("Dice.toss(): " + (rand.nextInt(5) + 1));
	}

	public static IGameFactory gameFactory = new IGameFactory() {

		@Override
		public IGame getGame() {
			// TODO Auto-generated method stub
			return new Dice();
		}
	};

}
