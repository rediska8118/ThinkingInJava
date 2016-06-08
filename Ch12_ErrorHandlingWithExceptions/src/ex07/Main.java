package ex07;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Main {

	private static Logger logger = Logger.getLogger("My Logger");

	static void logException(Exception e) {
		StringWriter trace = new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}

	public static void main(String[] args) {
		Object[] objects = new Object[1];
		try {
			objects[3] = new Object();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			
			logException(e);
		}
	}
}
