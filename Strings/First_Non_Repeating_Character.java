package Strings;

public class First_Non_Repeating_Character {
	public static void main(String[] args) {
		String s = "aabbfcde";

		for (int i = 0; i < s.length(); i++) {
			int count = 0;

			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j))
					count++;
			}

			if (count == 1) {
				System.out.println("First Non-Repeating: " + s.charAt(i));
				break;
			}
		}
	}

}
