package ex20;

public class Main {

	public static void main(String[] args) {
		HeroImpl hero = new HeroImpl();
		
		SuperHero superHero = new SuperHero();
		superHero.doBest(hero);
	}
}
