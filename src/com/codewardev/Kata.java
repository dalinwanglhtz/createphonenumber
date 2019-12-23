package com.codewardev;

import java.util.Arrays;

public class Kata {

	public static String createPhoneNumber(int[] numbers) {
		String result = Arrays.toString(numbers).replaceAll(", ", "").replaceAll("(\\d{3})(\\d{3})(\\d{4})", "($1) $2-$3");
		
		return result.substring(1, result.length()-1);
	}

}
