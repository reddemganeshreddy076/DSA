package Strings;

class StringRotationCheck {
	public static void main(String[] args) {
		String s1 = "abcde";
		String s2 = "cdeab";

		if ((s1 + s1).contains(s2))
			System.out.println("Rotation");
		else
			System.out.println("Not Rotation");
	}
}
