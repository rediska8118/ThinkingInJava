package ex11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		String str = "Arline ate eight apples and one orange while Anita hadn’t any";
		System.out.println("Input: \"" + str + "\"");
		String regex = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";

		System.out.println("Regular expression: \"" + regex + "\"");
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		if (!m.find())
			System.out.println("No match found for " + "\"" + regex + "\"");
		m.reset();
		while (m.find()) {
			System.out.println("Match \"" + m.group() + "\" at position "
					+ m.start()
					+ ((m.end() - m.start() < 2) ? "" : ("-" + (m.end() - 1))));
		}

	}
}
