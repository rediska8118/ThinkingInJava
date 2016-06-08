package ex14;

interface Monster {
	void menace();
}

interface DangerousMonster extends Monster {
	void destroy();
}

interface Lethal {
	void kill();
}

class DragonZilla implements DangerousMonster {
	public void menace() {
	}

	public void destroy() {
	}
}

interface Vampire extends DangerousMonster, Lethal {
	void drinkBlood();
}

class VeryBadVampire implements Vampire {
	public void menace() {
	}

	public void destroy() {
	}

	public void kill() {
	}

	public void drinkBlood() {
	}
}

public class HorrorShow {
	static void u(Monster b) {
		b.menace();
	}

	static void v(DangerousMonster d) {
		d.menace();
		d.destroy();
	}

	static void w(Lethal l) {
		l.kill();
	}

	public static DangerousMonster makeDangerousMonster() {
		return new DangerousMonster() {
			@Override
			public void menace() {
				System.out.println("DangerousMonster.menace()");
			}

			@Override
			public void destroy() {
				System.out.println("DangerousMonster.destroy()");
			}
		};
	}

	public static Vampire makeVampire() {
		return new Vampire() {

			@Override
			public void kill() {
				System.out.println("Vampire.kill()");
			}

			@Override
			public void menace() {
				System.out.println("Vampire.menace()");
			}

			@Override
			public void destroy() {
				System.out.println("Vampire.destroy()");
			}

			@Override
			public void drinkBlood() {
				System.out.println("Vampire.drinkBlood()");
			}
		};
	}

	public static void main(String[] args) {
		DangerousMonster barney = new DragonZilla();
		u(barney);
		v(barney);
		Vampire vlad = new VeryBadVampire();
		u(vlad);
		v(vlad);
		w(vlad);
		System.out.println("==========");
		v(makeDangerousMonster());

		u(makeVampire());
		v(makeVampire());
		w(makeVampire());
	}
}