package ex28;

public class Main {

	class Generic1<T> {
		T t;

		void setT(T t) {
			this.t = t;
		}
	}

	class Generic2<T> {
		T t;

		T getT() {
			return t;
		}
	}

	<T> void contravariantArg(Generic1<? super T> g1, T t) {
		g1.setT(t);
	}

	<T> T covariantArg(Generic2<? extends T> g2) {
		return g2.getT();
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.contravariantArg(main.new Generic1<Number>(), new Integer(5));
		main.covariantArg(main.new Generic2<Number>());
	}
}
