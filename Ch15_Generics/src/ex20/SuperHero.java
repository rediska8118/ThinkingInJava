package ex20;

public class SuperHero {

	<T extends Hero> void doBest(T hero){
		hero.fight();
		hero.run();
	}
}
