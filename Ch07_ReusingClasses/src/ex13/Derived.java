package ex13;

public class Derived extends Base{

	void print(String str){
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		Derived derived = new Derived();
		derived.print(2);
		derived.print(2.123f);
		derived.print('a');
		derived.print("String");
	}
}
