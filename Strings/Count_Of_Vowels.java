package Strings;

public class Count_Of_Vowels {
	public static void approach1(String s) {
//		normal approach
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

//			ch.toLowerCase()//no such method

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U')
				count++;

		}

		System.out.println("vowels count in string \'" + s + "\' is : " + count);
	}

	public static void approach2(String s) {
//		using indexOf()
		int count = 0;
		String vowels = "aeiouAEIOU";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (vowels.indexOf(ch) != -1)
				count++;
		}
		System.out.println("vowels count in string \'" + s + "\' is : " + count);
	}

	public static void approach3(String s) {
		// using contains()
		// it accepts string, not char
		int count = 0;
		String vowels = "aeiouAEIOU";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (vowels.contains(ch + ""))
				count++;
		}
		System.out.println("vowels count in string \'" + s + "\' is : " + count);

	}

	public static void main(String[] args) {
		String string = "Money is sweeter than Honey";
		approach1(string);
		approach2(string);
		approach3(string);

	}

}
