package Arrays1D;

public class Sum_Of_Even_Elements {
	public static int sum(int[] a) {
		int sum = 0;
		for (int ele : a)
			if (ele % 2 == 0)
				sum += ele;

		return sum;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		System.out.println("The sum of even ele's is = " + sum(a));

	}

}
