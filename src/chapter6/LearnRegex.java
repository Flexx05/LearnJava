package chapter6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearnRegex {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("0\\d{11}");
		Matcher matcher = pattern.matcher("001205011983");
		System.out.println("Input String matches regex: " + matcher.matches());
	}
}
