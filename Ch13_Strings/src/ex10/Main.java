package ex10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		String str = "Java now has regular expressions";
		System.out.println("Input: \"" + str + "\"");
		String[] regexArr = { "^Java", "\\Breg.*",
				"n.w\\s+h(a|i)s", "s?", "s*", "s+", "s{4}", "S{1}.",
				"s{0,3}" };

		for (String regex : regexArr) {
			System.out.println("Regular expression: \"" + regex + "\"");
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(str);
			if (!m.find())
				System.out.println("No match found for " + "\"" + regex + "\"");
			m.reset();
			while (m.find()) {
				System.out.println("Match \""
						+ m.group()
						+ "\" at position "
						+ m.start()
						+ ((m.end() - m.start() < 2) ? ""
								: ("-" + (m.end() - 1))));
			}
		}
	}
}
