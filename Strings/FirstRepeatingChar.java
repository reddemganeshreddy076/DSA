package Strings;

import java.util.*;

class FirstRepeatingChar {
	public static void main(String[] args) {
		String str = "programming";
		Set<Character> set = new HashSet<>();

		for (char ch : str.toCharArray()) {
			if (set.contains(ch)) {
				System.out.println(ch);
				return;
			}
			set.add(ch);
		}
		System.out.println("No repeating character");
	}
}
