package Strings;

public class Rotation_Of_String {
	public static void main(String[] args) {
		String s1 = "abcde";
		String s2 = "cdeab";

		String temp = s1 + s1;

		if (temp.contains(s2))
			System.out.println("Rotation");
		else
			System.out.println("Not Rotation");
	}

}
