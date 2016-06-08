package ex06;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class MyException2 extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1996981464739497046L;
	
	private static Logger logger = Logger.getLogger("MyException Logger #2");

	public MyException2() {
		// TODO Auto-generated constructor stub
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}

}
