package Arrays1D;

public class Missing_Num_In_Array {
	public static int findMisising(int[] a) {
		int sum1 = 0;
		int n = a.length;
		for (int ele : a)
			sum1 += ele;
		int sum2 = n * (n + 1) / 2;
//		System.out.println(sum1 + " " + sum2);
		return sum2 - sum1;
	}

	public static void main(String[] args) {
		System.out.println(findMisising(new int[] { 0, 1, 2, 3, 4, 6 }));// 5
		System.out.println(findMisising(new int[] { 0, 1 }));// 2
		System.out.println(findMisising(new int[] { 0, 1, 9, 6, 5, 4, 2, 3, 7 }));// 8

	}

}
