package ex19;

import java.util.Random;

public class Coin implements IGame {

	Random rand = new Random();

	@Override
	public void toss() {
		// TODO Auto-generated method stub
		System.out.println("Coin.toss(): " + rand.nextInt(2));
	}

}
