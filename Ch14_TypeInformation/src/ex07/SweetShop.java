package ex07;

public class SweetShop {

	public static void main(String[] args) {
		System.out.println("inside main");

		if (args.length < 1) {
			System.out.println("Empty args");
			System.exit(0);
		}

		Class c = null;

		try {

			c = Class.forName("ex07." + args[2]);

			if (c.newInstance() instanceof Candy)
				new Candy();
			if (c.newInstance() instanceof Gum)
				new Gum();
			if (c.newInstance() instanceof Cookie)
				new Gum();
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
