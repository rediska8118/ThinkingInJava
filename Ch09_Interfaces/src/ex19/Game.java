package ex19;

public class Game {

	static void tose(IGameFactory factory) {
		factory.getGame().toss();
	}

	public static void main(String[] args) {
		tose(new CoinFactory());
		tose(new DiceFactory());
	}

}
