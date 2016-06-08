package ex19;

public class Main {

	private final Data data;

	Main() {
		data = new Data();
	}

	public static void main(String[] args) {
		Main main1 = new Main();
		System.out.println(main1.data);
		
		Main main2 = new Main();
		System.out.println(main2.data);
		
		Data data3 = new Data();
		//main2.data = data3;
		
		Main main4 = new Main();
		System.out.println(main4.data);
		
	}
}
