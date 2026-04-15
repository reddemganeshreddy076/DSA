package Strings;

public class Upper_Lower_Case_Letters_Alternatively {
	public static char toLower(char ch) {
		if (ch >= 'A' && ch <= 'Z')
			ch = (char) (ch + 32);
		return ch;
	}

	public static char toUpper(char ch) {
		if (ch >= 'a' && ch <= 'z')
			ch = (char) (ch - 32);
		return ch;
	}

	public static String alter(String s) {
		String res = "";
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == ' ') {
				res = res + ch;
				continue;
			}
			if (count % 2 == 1)
				res = res + toUpper(ch);
			else
				res = res + toLower(ch);
			count++;
		}
		return res;

	}

	public static void main(String[] args) {
		System.out.println(alter("  HAppy Birth DAY , Enjoy PanDAGoww"));
//		 HaPpY bIrTh DaY , EnJoY pAnDaGoWw

		System.out.println(alter("        MindSet IS a PowerFul WeaPon"));
//	        MiNdSeT iS a PoWeRfUl WeApOn

	}

}
