package by.htp.les10.main.task05a.service.util;

import java.util.regex.Pattern;

public class Validator {
	
	public static boolean validBouquet(String name) {
		return Pattern.matches("[A-Z]{1}[a-z]+", name);
	}

	public static boolean validFlower(String name) {
		return Pattern.matches("[A-Z]{1}[a-z]+", name);
	}

	public static boolean validCover(String name) {
		return Pattern.matches("[A-Z]{1}[a-z]+", name);
	}

}
