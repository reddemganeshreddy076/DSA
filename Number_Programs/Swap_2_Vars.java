package Numbers;

public class Swap_2_Vars {
	public static void approach1() {
//		1.with temp
		int a = 10;
		int b = 20;
		System.out.println("Before Swapping");
		System.out.println("a : " + a + ", b :" + b);
		int t = a;
		a = b;
		b = t;
		System.out.println("-".repeat(10));
		System.out.println("after Swapping");
		System.out.println("a : " + a + ", b :" + b);

		System.out.println("_".repeat(100));
	}

	public static void approach2() {
//		2.with +,-
		int a = 10;
		int b = 20;
		System.out.println("Before Swapping");
		System.out.println("a : " + a + ", b :" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("-".repeat(10));
		System.out.println("after Swapping");
		System.out.println("a : " + a + ", b :" + b);

		System.out.println("_".repeat(100));
	}

	public static void approach3() {
//		3.with *,/
		int a = 10;
		int b = 20;
		System.out.println("Before Swapping");
		System.out.println("a : " + a + ", b :" + b);
		if (a != 0 && b != 0) {
			a = a * b;
			b = a / b;
			a = a / b;
		}
		System.out.println("-".repeat(10));
		System.out.println("after Swapping");
		System.out.println("a : " + a + ", b :" + b);

		System.out.println("_".repeat(100));
	}

	public static void approach4() {
//		4.with ^
		int a = 10;
		int b = 20;
		System.out.println("Before Swapping");
		System.out.println("a : " + a + ", b :" + b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("-".repeat(10));
		System.out.println("after Swapping");
		System.out.println("a : " + a + ", b :" + b);

		System.out.println("_".repeat(100));
	}

	public static void approach5() {
//		5.with direct expression
		int a = 10;
		int b = 20;
		System.out.println("Before Swapping");
		System.out.println("a : " + a + ", b :" + b);
		a = b - a + (b = a);
		System.out.println("-".repeat(10));
		System.out.println("after Swapping");
		System.out.println("a : " + a + ", b :" + b);

		System.out.println("_".repeat(100));
	}

	public static void main(String[] args) {
		approach1();
		approach2();
		approach3();
		approach4();
		approach5();

	}

}
