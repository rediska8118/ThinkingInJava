package ex17;

import java.util.Random;

public class Coin implements IGame {

	Random rand = new Random();

	@Override
	public void toss() {
		// TODO Auto-generated method stub
		System.out.println("Coin.toss(): " + rand.nextInt(2));
	}

	public static IGameFactory gameFactory = new IGameFactory() {

		@Override
		public IGame getGame() {
			// TODO Auto-generated method stub
			return new Coin();
		}
	};

}
