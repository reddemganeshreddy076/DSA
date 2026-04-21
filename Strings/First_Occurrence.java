package Strings;

public class First_Occurrence {
	public static void main(String[] args) {
		String str = "programming";
		char target = 'g';

		int index = -1;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == target) {
				index = i;
				break;
			}
		}

		System.out.println("Index: " + index);
	}

}
