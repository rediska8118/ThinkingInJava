package ex11;

public class Main {

	public static void main(String[] args) {
		AllTheColorsOfTheRainbow allTheColorsOfTheRainbow = new AllTheColorsOfTheRainbow();
		for (int i = 0; i <= 7; i++) {

			allTheColorsOfTheRainbow.changeTheHueOfTheColor(i);
			System.out.println("New hew color: "
					+ allTheColorsOfTheRainbow.anIntegerRepresentingColors);
		}
	}
}
