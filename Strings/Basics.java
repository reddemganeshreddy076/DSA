package Strings;

public class Basics {
	public static void main(String[] args) {
		String string = new String("Hello");
		String string2 = "World";

//Length()
		System.out.println(string.length());
		for (int i = 0; i < string.length(); i++)
			System.out.print(string.charAt(i));
		System.out.println();
//toString()
		System.out.println(string);
		System.out.println(string.toString());

//charAt()
//		System.out.println(string2.charAt(11));// java.lang.StringIndexOutOfBoundsException
		System.out.println(string2.charAt(2));

//substring()
		System.out.println(string2.substring(1, 4));
//		System.out.println(string2.substring(10));//SIOOBE
//		System.out.println(string2.substring(1,10));//SIOOBE
//		System.out.println(string2.substring(2,1));//SIOOBE

//toLowerCase()
		System.out.println(string2.toLowerCase());
		System.out.println(string2);

//toUpperCase()
		System.out.println(string2.toUpperCase());
		System.out.println(string2);

//indexOf()
		System.out.println(string.indexOf("he"));// -1
		System.out.println(string.indexOf("He"));// 0
		System.out.println(string.indexOf('H'));// 0
		System.out.println();

//contains()
		System.out.println(string.contains(string2));
		System.out.println(string.contains("Pokiri"));
//		System.out.println(string.contains('P'));//required str ,given char

//startsWith()
		System.out.println(string.startsWith(string2));
		System.out.println(string.startsWith("he"));
		System.out.println(string.startsWith("Hell"));
//		System.out.println(string.startsWith('H'));//required str ,given char

//endsWith()
		System.out.println();
		System.out.println(string.endsWith(string2));
		System.out.println(string.endsWith("he"));
		System.out.println(string.endsWith("Hell"));
//		System.out.println(string.endsWith('H'));//required str ,given char

//trim()
		string = "                 hi           hello  ";
		System.out.println(string.trim() + "check");
		System.out.println(string);
		
//stripIndent()
		System.out.println(string.stripIndent() + "check");
		System.out.println();

	}

}
