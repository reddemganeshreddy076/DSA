package Strings;

public class Remove_All_Adjacent_Dups_Using_SB {
	public static String remove(String s) {
		StringBuffer sb = new StringBuffer(s);
		for (int i = 0; i < sb.length()-1; i++) {
			if (sb.charAt(i) == sb.charAt(i + 1)) {
				System.out.println(sb);
				sb.delete(i,i+2);
				System.out.println(sb.length());
				i=-1;

			}
		}
		return new String(sb);

	}

	public static void main(String[] args) {
		System.out.println(remove("abbabbabbabbabbabba"));
		/*
		abbabbabbabbabbabba
		17
		aabbabbabbabbabba
		15
		bbabbabbabbabba
		13
		abbabbabbabba
		11
		aabbabbabba
		9
		bbabbabba
		7
		abbabba
		5
		aabba
		3
		bba
		1
		a
		*/
		System.out.println(remove("abbabbabbabbabbabbaa"));
		/*abbabbabbabbabbabbaa
		18
		aabbabbabbabbabbaa
		16
		bbabbabbabbabbaa
		14
		abbabbabbabbaa
		12
		aabbabbabbaa
		10
		bbabbabbaa
		8
		abbabbaa
		6
		aabbaa
		4
		bbaa
		2
		aa
		0
		

*/
		

	}

}
