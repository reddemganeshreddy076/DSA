package Numbers;

public class Swap_3_Vars {
	public static void approach1() {
//		1.with temp
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println("before swapping, a: " + a + " b: " + b + " c: " + c);
		int t = a;
		a = c;
		c = b;
		b = t;
		System.out.println("after swapping, a: " + a + " b: " + b + " c: " + c);
	}

	public static void approach2() {
//		2.without temp
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println("before swapping, a: " + a + " b: " + b + " c: " + c);
		a = a + b + c;
		b = a - (b + c);
		c = a - (b + c);
		a = a - (b + c);
		System.out.println("after swapping, a: " + a + " b: " + b + " c: " + c);
	}

	public static void main(String[] args) {
		approach1();
		approach2();

	}

}
