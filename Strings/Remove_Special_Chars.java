package Strings;

public class Remove_Special_Chars {
	public static void main(String[] args) {
		String s = "a@b#1!";
		String result = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (Character.isLetterOrDigit(ch))
				result += ch;
		}

		System.out.println(result);

	}

}
