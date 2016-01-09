package ex06;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class MyException1 extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5678547548610726277L;

	private static Logger logger = Logger.getLogger("MyException Logger #1");

	public MyException1() {
		// TODO Auto-generated constructor stub
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}
