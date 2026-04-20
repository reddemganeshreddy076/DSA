package Strings;

import java.util.Stack;

public class Remove_All_Adjacent_Dups_Using_Stack {
	public static String remove(String s) {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (st.isEmpty())
				st.push(ch);
			else if (st.peek() == ch)
				st.pop();
			else {
				st.push(ch);
			}
		}

		String res = "";
		for (char ch : st)
			res += ch;

		return res;
	}

	public static void main(String[] args) {
		System.out.println(remove("abbabab"));// bab
		System.out.println(remove("abbababb"));// ba

	}

}
