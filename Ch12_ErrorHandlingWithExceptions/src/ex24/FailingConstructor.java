package ex24;

import java.io.File;

public class FailingConstructor {

	private InputFile file1;
	private InputFile file2;

	public FailingConstructor(String str) {

		try {
			file1 = new InputFile(str);

			try {
				file2 = new InputFile(str);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Failed to create file2");
				file1.dispose();
			}
		} catch (Exception e) {

			e.printStackTrace(System.err);
			System.out.println("Failed to create file1");
		}

	}

	public static void main(String[] args) {

		new FailingConstructor(File.listRoots()[0].getPath());

	}
}
