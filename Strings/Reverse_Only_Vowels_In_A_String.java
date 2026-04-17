package Strings;

import java.util.Arrays;

public class Reverse_Only_Vowels_In_A_String {
	public static boolean isVowel(char ch) {
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U';
	}

	public static String reverse(String s) {
		char[] ch = s.toCharArray();
		int i = 0, j = ch.length - 1;
		while (i < j) {
			if (isVowel(ch[i]) && isVowel(ch[j])) {
				char temp = ch[i];
				ch[i] = ch[j];
				ch[j] = temp;
				i++;
				j--;
			} else if (!isVowel(ch[i]))
				i++;
			else if (!isVowel(ch[j]))
				j--;
		}
		System.out.println(Arrays.toString(ch));
		return new String(ch);

	}

	public static void main(String[] args) {
		String string = reverse("More Over, Be The Best & Fuck The Rest..");
		System.out.println(string);// Mereuver, Be The Best & FOck The Rost..

	}

}
