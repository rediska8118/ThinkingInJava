package ex22;

public class FailingConstructor {

	public FailingConstructor() throws Exception {

		throw new RuntimeException("FailingConstructor msg");
	}

	public static void main(String[] args) {
		try {
			new FailingConstructor();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
