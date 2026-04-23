package Strings;

import java.util.Arrays;

public class Anagram_Check_WithOut_BuiltIn_Methods {
	public static void sort(char ch[]) {
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				if (ch[i] < ch[j]) {
					char temp = ch[j];
					ch[j] = ch[i];
					ch[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(ch));
	}

	public static char[] toCharArray(String s) {
		int size = s.length();
		char[] ch = new char[size];
		for (int i = 0; i < s.length(); i++) {
			ch[i] = s.charAt(i);
		}
		return ch;
	}
	static boolean isAnagram(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		char ch1[] = toCharArray(s1.toLowerCase());
		char ch2[] = toCharArray(s2.toLowerCase());
		sort(ch1);
		sort(ch2);
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] != ch2[i])
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(isAnagram("Anagram", "Nagaram"));
		System.out.println(isAnagram("heart", "Earth"));
		System.out.println(isAnagram("race", "care"));
		System.out.println(isAnagram("heart", "Earth"));
		System.out.println(isAnagram("Ganesh", "Nagesh"));
		System.out.println(isAnagram("Russia", "Asia"));
	}
}
/*
[a, a, a, g, m, n, r]
[a, a, a, g, m, n, r]
true
[a, e, h, r, t]
[a, e, h, r, t]
true
[a, c, e, r]
[a, c, e, r]
true
[a, e, h, r, t]
[a, e, h, r, t]
true
[a, e, g, h, n, s]
[a, e, g, h, n, s]
true
false
*/