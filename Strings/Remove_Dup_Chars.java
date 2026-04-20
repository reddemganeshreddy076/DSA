package Strings;

public class Remove_Dup_Chars {
	public static String approach1(String s) {
		StringBuffer sb = new StringBuffer(s);
		for (int i = 0; i < sb.length(); i++) {
			char ch = sb.charAt(i);
			if (sb.indexOf(ch + "") != sb.lastIndexOf(ch + ""))
				sb.deleteCharAt(sb.lastIndexOf(ch + ""));
		}
		return sb.toString();
	}

	public static String approach2(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (res.indexOf(ch) == -1) {
				res += ch;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(approach1("programming"));
		System.out.println(approach2("programming"));

		System.out.println(approach1("madam"));
		System.out.println(approach2("madam"));

		System.out.println(approach1("java"));
		System.out.println(approach2("java"));

	}

}
/*
progamin
progamin
mad
mad
jav
jav
*/