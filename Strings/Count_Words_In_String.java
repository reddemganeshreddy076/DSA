package Strings;

import java.util.Arrays;

public class Count_Words_In_String {
	public static int count(String s) {
		s = s.trim();
		String[] strings = s.split(" +");
		System.out.println(Arrays.toString(strings));
		return strings.length;
	}

	public static int count2(String s) {
		s = s.trim();
		int count = 0;
		for (int i = 0; i < s.length()-1; i++) {
			if (s.charAt(i) != ' ' && s.charAt(i + 1) == ' ')
				count++;
		}
		return count+1;
	}

	public static void main(String[] args) {
		System.out.println(count("   Love is easy but     king is busy"));// 7
		System.out.println(count2("   Love is easy but          king is busy"));// 7

	}
}
