package Strings;

public class Duplicate_Chars {
	public static void main(String[] args) {
		String s = "programming";

		for (int i = 0; i < s.length(); i++) {
			int count = 1;

			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}

			if (count > 1)
				System.out.println(s.charAt(i));
		}
	}
}
