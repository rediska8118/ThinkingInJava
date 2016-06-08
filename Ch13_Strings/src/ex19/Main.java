package ex19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ex15.TextFile;

public class Main {

	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Usage: fileName");
			System.exit(0);
		}
		// we want all class names:
		Pattern p = Pattern.compile("class \\w+\\s+");
		// not including those in comment lines:
		Pattern q = Pattern.compile("^(//|/\\*|\\*)");
		System.out.println("classes in " + args[0] + ":");
		// Iterate through the lines of the input file:
		int index = 0;
		Matcher m = p.matcher(""); // creates emtpy Matcher object
		Matcher n = q.matcher("");
		for (String line : new TextFile(args[0])) {
			m.reset(line);
			n.reset(line);
			while (m.find() && !n.find())
				System.out.println(index++ + ": " + m.group());
		}
	}

}
