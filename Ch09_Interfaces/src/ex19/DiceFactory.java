package ex19;

public class DiceFactory implements IGameFactory {

	@Override
	public IGame getGame() {
		// TODO Auto-generated method stub
		return new Dice();
	}

}
