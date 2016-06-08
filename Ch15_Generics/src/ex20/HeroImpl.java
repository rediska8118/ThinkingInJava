package ex20;

public class HeroImpl implements Hero{

	@Override
	public void fight() {
		System.out.println("Hero.fight()");
	}

	@Override
	public void run() {
		System.out.println("Hero.run()");		
	}
	
	public void help(){
		System.out.println("Hero.help()");
	}

}
