package ex23;

public class A {

	U makeU(){
		return new U() {
			
			@Override
			public void method3() {
				System.out.println("A.method3()");
				
			}
			
			@Override
			public void method2() {
				System.out.println("A.method2()");
				
			}
			
			@Override
			public void method1() {
				System.out.println("A.method1()");
				
			}
		};
	}
}
