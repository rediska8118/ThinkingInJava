package ex21;

public interface Interface {

	void show();

	class Inner {

		static void doBest(Interface i) {
			i.show();
		}

	}
}
