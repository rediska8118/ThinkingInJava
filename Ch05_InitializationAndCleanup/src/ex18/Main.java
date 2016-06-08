package ex18;

public class Main {

	Main(String str) {

		System.out.println(str);
	}

	public static void main(String[] args) {

		Main[] mainArr = new Main[2];
		mainArr[0] = new Main("aaa");
		mainArr[1] = new Main("bbb");
	}
}
