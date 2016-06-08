package ex16;

class AlertStatus {
	public void doSmth() {
	}
}

class Normal extends AlertStatus {
	public void doSmth() {
		System.out.println("Normal");
	}
}

class Mayday extends AlertStatus {
	public void doSmth() {
		System.out.println("Mayday");
	}
}

class Starship {
	private AlertStatus alertStatus = new Normal();

	public void change() {
		alertStatus = new Mayday();
	}

	public void performJob() {
		alertStatus.doSmth();
	}
}

public class Transmogrify {
	public static void main(String[] args) {
		Starship starship = new Starship();
		starship.performJob();
		starship.change();
		starship.performJob();
	}
}
