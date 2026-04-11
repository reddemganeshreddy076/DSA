package Strings;

public class Swap_2_Strings {
	public static void approach1(String s1, String s2) {
//		using temp
		System.out.println("before swapping :");
		System.out.println("string 1 :" + s1);
		System.out.println("string 2 : " + s2);
		String t = s1;
		s1 = s2;
		s2 = t;
		System.out.println("-".repeat(10));
		System.out.println("after swapping :");
		System.out.println("string 1 :" + s1);
		System.out.println("string 2 : " + s2);
	}

	public static void approach2(String s1, String s2) {
//		without 3rd variable
		System.out.println("before swapping :");
		System.out.println("string 1 :" + s1);
		System.out.println("string 2 : " + s2);
		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());

		System.out.println("-".repeat(10));
		System.out.println("after swapping :");
		System.out.println("string 1 :" + s1);
		System.out.println("string 2 : " + s2);

	}

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "python";
		approach1(s1, s2);
		System.out.println("-".repeat(60));
		approach2(s1, s2);

	}

}

/*
before swapping :
string 1 :java
string 2 : python
----------
after swapping :
string 1 :python
string 2 : java
------------------------------------------------------------
before swapping :
string 1 :java
string 2 : python
----------
after swapping :
string 1 :python
string 2 : java

*/