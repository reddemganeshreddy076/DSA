package Strings;

import java.util.*;

public class Reverse_A_String_Except_Special_Chars {

	public static String reverse(String s) {
		char[] ch = s.toCharArray();
		int i = 0, j = ch.length - 1;
		while (i < j) {
			if (Character.isLetterOrDigit(ch[i]) && Character.isLetterOrDigit(ch[j])) {
				char temp = ch[i];
				ch[i] = ch[j];
				ch[j] = temp;
				i++;
				j--;

			} else if (!Character.isLetterOrDigit(ch[i]))
				i++;
			else if (!Character.isLetterOrDigit(ch[j]))
				j--;
		}
		System.out.println(Arrays.toString(ch));
		return new String(ch);

	}

	public static void main(String[] args) {
		String string = reverse("Hello ! Indian@Org-123");
		System.out.println(string);
		System.out.println("-".repeat(15));
		String string2 = reverse("Hello@#$%abcd12.com");
		System.out.println(string2);

	}
}
