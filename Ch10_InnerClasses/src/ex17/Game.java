package ex17;

public class Game {

	static void tose(IGameFactory factory) {
		factory.getGame().toss();
	}

	public static void main(String[] args) {
		tose(Coin.gameFactory);
		tose(Dice.gameFactory);
	}

}
