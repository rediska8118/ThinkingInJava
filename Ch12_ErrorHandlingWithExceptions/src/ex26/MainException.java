package ex26;

import java.io.FileInputStream;

public class MainException {

	public static void main(String[] args) throws Exception {
		// Open the file:
		FileInputStream file = new FileInputStream("MainExceptionjava");
		// Use the file ...
		// Close the file:
		file.close();
	}
}
