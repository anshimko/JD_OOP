package by.htp.les10.main.task05b.service.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

	public static boolean validParam(String name, int price) {

		Pattern pattern = Pattern.compile("[A-Z][a-z]{2,10}");
		Matcher matcher = pattern.matcher(name);
		if (matcher.matches() && price > 0 && price < 30) {
			return true;
		}
		return false;
	}
}
