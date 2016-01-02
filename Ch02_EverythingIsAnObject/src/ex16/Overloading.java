package ex16;

/**
 * 
 * @author aw3
 * @version 1.0
 * @since 18.12.2015
 *
 */
public class Overloading {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Tree t = new Tree(i);
			t.info();
			t.info("overloaded method");
		}
		// Overloaded constructor:
		new Tree();
	}
}
