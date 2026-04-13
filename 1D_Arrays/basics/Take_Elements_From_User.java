package Arrays1D.basics;

import java.util.*;

public class Take_Elements_From_User {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array :");
		int size = scanner.nextInt();
		int[] a = new int[size];
		System.out.println("enter elements :");
		for (int i = 0; i < size; i++) {
			a[i] = scanner.nextInt();
		}

		System.out.println("Your elements :");
		System.out.println(Arrays.toString(a));
		scanner.close();
	}
}

/*
 * Enter size of array : 4 
 * enter elements : 
 * 1 2 3 4 
 * Your elements : 
 * [1, 2, 3, 4]
 */
