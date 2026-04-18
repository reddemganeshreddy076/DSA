package Arrays1D.subArrays;

public class All_Possible_SubArrays {
	public static void printArrays(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				for (int k = i; k <= j; k++) {
					System.out.print(a[k] + " ");
				}
				System.out.println();
			}
			System.out.println("-".repeat(10));
		}
	}

	public static void main(String[] args) {
		printArrays(new int[] { 1, 2, 3, 4, 5 });

	}

}
/*
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
----------
2 
2 3 
2 3 4 
2 3 4 5 
----------
3 
3 4 
3 4 5 
----------
4 
4 5 
----------
5 
----------
*/
