package Dups;

public class FrequencyOfArrEles {

	public static void printFrequency(int[] a) {

		int inf = Integer.MIN_VALUE;
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int dups = 1;
			if (a[i] != inf) {
				for (int j = i + 1; j < n; j++) {
					if (a[i] == a[j]) {
						a[j] = inf;
						dups++;

					}
				}
				System.out.println(a[i] + "==> " + dups);
			}
			
			
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 3, 4, 4, 4, 4, 5 };
		printFrequency(arr);

	}

}
