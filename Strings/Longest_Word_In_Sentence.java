package Strings;

public class Longest_Word_In_Sentence {
	public static void main(String[] args) {
		String s = "I love programming";
		String[] words = s.split(" ");

		String longest = "";

		for (String w : words) {
			if (w.length() > longest.length())
				longest = w;
		}

		System.out.println("Longest word: " + longest);
	}

}
