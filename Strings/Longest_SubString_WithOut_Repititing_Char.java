package Strings;

public class Longest_SubString_WithOut_Repititing_Char {
	public static void printLongestSub(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			String temp = "";
			for (int j = i; j < s.length(); j++) {
				char ch = s.charAt(j);
				if (temp.indexOf(ch) == -1) {
					temp += ch;
				} else {
					break;
				}
			}
			if (temp.length() > res.length()) {
				res = temp;
			}
		}
		System.out.println("Output : " + res);
	}

	public static void main(String[] args) {
		printLongestSub("abbabbacadagsertooo");

	}

}
//Output : dagserto