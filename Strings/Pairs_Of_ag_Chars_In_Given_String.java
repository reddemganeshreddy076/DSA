package Strings;

public class Pairs_Of_ag_Chars_In_Given_String {

	public static int approach1(String s) {
		int count = 0, gCount = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			if (ch == 'g') {
				gCount++;
			} else if (ch == 'a') {
				count += gCount;
			}
		}
		return count;
	}

	public static int approach2(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a') {
				for (int j = i + 1; j < s.length(); j++) {
					if (s.charAt(j) == 'g')
						count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(approach1("agniaa"));//1
		System.out.println(approach2("agniaa"));//1
		
		System.out.println(approach1("afgbgaeggbg"));//8
		System.out.println(approach2("afgbgaeggbg"));//8
		

	}

}
