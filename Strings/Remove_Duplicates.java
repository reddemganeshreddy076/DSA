package Strings;

public class Remove_Duplicates {
	public static void main(String[] args) {
		String s = "banana";
		String result = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (result.indexOf(ch) == -1)
				result += ch;
		}

		System.out.println(result);
	}

}
