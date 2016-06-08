package ex19;

import java.util.Random;

public class Dice implements IGame {

	Random rand = new Random();

	@Override
	public void toss() {
		// TODO Auto-generated method stub
		System.out.println("Dice.toss(): " + (rand.nextInt(5) + 1));
	}

}
