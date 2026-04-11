package Strings;

public class Reverse_String {

	public static void approach1(String s) {
		String temp = "";
		for (int i = 0; i < s.length(); i++)
			temp = s.charAt(i) + temp;
		System.out.println(temp);

	}

	public static void approach2(String s) {
		StringBuffer sb = new StringBuffer(s).reverse();
		System.out.println(sb);

	}

	public static void approach3(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev += s.charAt(i);
		}
		System.out.println(rev);

	}

	public static void main(String[] args) {
		String s = "hello";
		approach1(s);
		System.out.println("-".repeat(10));
		approach2(s);
		System.out.println("-".repeat(10));
		approach3(s);

	}
}
/*
olleh
----------
olleh
----------
olleh

*/

