package ex19;

public class CoinFactory implements IGameFactory {

	@Override
	public IGame getGame() {
		// TODO Auto-generated method stub
		return new Coin();
	}

}
