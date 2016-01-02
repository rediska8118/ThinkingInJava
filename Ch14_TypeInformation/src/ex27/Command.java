package ex27;

public class Command {
	private static int count = 0;
	String str = String.valueOf(count++);
	
	void operation(){
		System.out.println(str);
	}

}
