package Arrays1D.basics;

import java.util.Arrays;

public class Basics_1 {
	public static void storePrimitives() {
		// creation of arrays using {}
		int[] a = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(a));// [1, 2, 3, 4]

		int i = 10, j = 11, k = 12, l = 11, m = 13;
		int b[] = { i, j, k, l, m };
		System.out.println(Arrays.toString(b));// [10, 11, 12, 11, 13]

		int c[] = { 'a', 'b', 'c', 'd' };
		System.out.println(Arrays.toString(c));// [97, 98, 99, 100]

		char ch[] = { 'a', 'b', 'c' };
		System.out.println(Arrays.toString(ch));// [a, b, c]

		char ch2[] = { 90, 83, 73 };// [Z, S, I]
		System.out.println(Arrays.toString(ch2));

//				int d[]= {1.1,2,3};error
		int d[] = { (int) 1.1, 2, 3 };
		System.out.println(Arrays.toString(d));// [1, 2, 3]

		int e[] = { 10 / 2, 100 / 10, 1 / 1, 0 / 100 };
		System.out.println(Arrays.toString(e));
	}

	public static void storeNonPrimitives() {
		Student[] s1 = { new Student(101, "gani"), new Student(102, "rithvik") };
		System.out.println(Arrays.toString(s1));

	}

	public static void main(String[] args) {
		storePrimitives();
		storeNonPrimitives();

	}

}

class Student {
	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "{ " + this.id + ", " + this.name + " }";
	}

}
