package Strings;

public class Frequency_Of_Chars {
	public static void main(String[] args) {
		String s = "aabbc";

		for (int i = 0; i < s.length(); i++) {
			int count = 1;

			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}

			boolean alreadyCounted = false;
			for (int k = 0; k < i; k++) {
				if (s.charAt(i) == s.charAt(k))
					alreadyCounted = true;
			}

			if (!alreadyCounted)
				System.out.println(s.charAt(i) + " = " + count);

		}
	}

}
