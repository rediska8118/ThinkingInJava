package ex11;

public class Apply {
	public static void process(Processor p, Object s) {
		System.out.println("Using Processor " + p.name());
		System.out.println(p.process(s));
	}

	public static void main(String[] args) {
		process(new Swap(), "abcdefg");
	}
}
