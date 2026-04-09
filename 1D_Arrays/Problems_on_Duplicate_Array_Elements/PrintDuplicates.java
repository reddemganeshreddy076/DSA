package Dups;

public class PrintDuplicates {

	public static void printDuplicates(int[] a) {

		int inf = Integer.MIN_VALUE;
		int n = a.length;

		System.out.print("[");
		for (int i = 0; i < n; i++) {
			int dups = 0;
			if (a[i] != inf) {
				for (int j = i + 1; j < n; j++) {
					if (a[i] == a[j]) {
						a[j] = inf;
						dups++;

					}
				}
			}

			if (dups > 0) {
				System.out.print(a[i] + ", ");
			}

		}
		System.out.print("]");
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 3, 4, 4, 4, 4, 5 };
		printDuplicates(arr);

	}

}
