package ex09;

public class Main {

	static int i = 123;
	static byte b = 124;
	static double d = 1.1d;
	static float f = 1.1f;
	static char ch = 'x';
	static boolean boo = true;
	static long l = 54l;

	public static void main(String[] args) {
		Integer _integer = i;
		Byte _byte = b;
		Double _double = d;
		Float _float = f;
		Character _character = ch;
		Boolean _boolean = boo;
		Long _long = l;
		
		System.out.println(_integer);
		System.out.println(_byte);
		System.out.println(_double);
		System.out.println(_float);
		System.out.println(_character);
		System.out.println(_boolean);
		System.out.println(_long);

	}

}
