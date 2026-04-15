package Strings;

public class Remove_Extra_Spaces_In_STring {
	public static String remove(String s) {
		s = s.trim();
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ') {
				i++;
				continue;
			}
			res = res + s.charAt(i);
		}

		return res;

	}

	public static void main(String[] args) {
		String str ="E sala cup                    namde";
		System.out.println(remove(str));

	}
}
