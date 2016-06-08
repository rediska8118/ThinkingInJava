package ex26;

public class Main {

	public static void main(String[] args) {
		Number[] numbers = new Integer[3];
		numbers[0] = new Integer(0);
		numbers[1] = new Integer(1);
		numbers[2] = new Integer(2);
		
		try {
			numbers[0] = new Float(0.1f);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		//Integer[] integers = numbers;
	}
}
