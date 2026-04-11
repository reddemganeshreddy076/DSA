package Strings;

public class Classify_Type_Of_String {
	public static void classify(String s) {

		int uc = 0, lc = 0, d = 0, sc = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
				uc++;
			else if (ch >= 'a' && ch <= 'z')
				lc++;
			else if (ch >= '0' && ch <= '9')
				d++;
			else
				sc++;
		}

		if ((uc != 0 || lc != 0) && d == 0 && sc == 0) {
			System.out.println("alphabetic..");
		} else if ((uc != 0 || lc != 0) && d != 0 && sc == 0) {
			System.out.println("alpha-numeric..");

		} else if ((uc == 0 && lc == 0) && d != 0 && sc == 0) {
			System.out.println("numeric..");

		} else if ((uc == 0 && lc == 0) && d == 0 && sc != 0) {
			System.out.println("special chars..");
		}
		
	}

	public static void main(String[] args) {
		String string = "ganeshreddygani143212";
		String string2="ganesh";
		String s3="9848022338";
		classify(string);
		classify(string2);
		classify(s3);
	}

}
