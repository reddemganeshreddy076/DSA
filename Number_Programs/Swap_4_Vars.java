package Numbers;

public class Swap_4_Vars {
	public static void approach() {
//		without temp
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		System.out.println("before swapping, a: " + a + " b: " + b + " c: " + c + " d: " + d);
		a = a + b + c + d;
		b = a - (b + c + d);
		c = a - (b + c + d);
		a = a - (b + c + d);
		System.out.println("after swapping, a: " + a + " b: " + b + " c: " + c + " d: " + d);
	}

	public static void main(String[] args) {
		approach();

	}

}
