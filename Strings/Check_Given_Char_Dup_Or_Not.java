package Strings;

public class Check_Given_Char_Dup_Or_Not {
	public static boolean check2(String s, char ch) {
		return s.indexOf(ch + "") != s.lastIndexOf(ch + "");
	}

	public static boolean check(String s, char ch) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ch)
				count++;
			if (count > 1)
				return true;
		}

		return false;
	}

	public static void main(String[] args) {
		System.out.println(check("Program", 'r'));// true
		System.out.println(check("Program", 'o'));// false

		System.out.println(check2("Program", 'r'));// true
		System.out.println(check2("Program", 'o'));// false

	}

}