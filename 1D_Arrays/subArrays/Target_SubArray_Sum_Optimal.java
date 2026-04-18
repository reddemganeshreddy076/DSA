package Arrays1D.subArrays;

import java.util.Scanner;

public class Target_SubArray_Sum_Optimal {
	public static void findCountOfSubs(int[] a, int target) {
		int countOfSubs = 0;
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = i; j < a.length; j++) {
					System.out.print(a[j] + " ");
					sum = sum + a[j];
				System.out.println("->" + sum);
				if (sum == target)
					countOfSubs++;
			}
			System.out.println("-------------");
		}
		System.out.println("count:"+countOfSubs);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Target SubArray Sum: ");
		int target = scanner.nextInt();
		findCountOfSubs(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }, target);
		scanner.close();

	}

}
/*
Enter Target SubArray Sum: 
12

1 ->1
2 ->3
3 ->6
4 ->10
5 ->15
6 ->21
7 ->28
8 ->36
-------------
2 ->2
3 ->5
4 ->9
5 ->14
6 ->20
7 ->27
8 ->35
-------------
3 ->3
4 ->7
5 ->12
6 ->18
7 ->25
8 ->33
-------------
4 ->4
5 ->9
6 ->15
7 ->22
8 ->30
-------------
5 ->5
6 ->11
7 ->18
8 ->26
-------------
6 ->6
7 ->13
8 ->21
-------------
7 ->7
8 ->15
-------------
8 ->8
-------------
count:1
*/