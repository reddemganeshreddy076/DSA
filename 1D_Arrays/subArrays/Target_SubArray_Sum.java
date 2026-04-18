package Arrays1D.subArrays;

import java.util.Scanner;

public class Target_SubArray_Sum {
	public static void findCountOfSubs(int[] a, int target) {
		int countOfSubs = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					System.out.print(a[k] + " ");
					sum = sum + a[k];
				}
				System.out.println("->" + sum);
				if (sum == target)
					countOfSubs++;
			}
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

//sample ip: [1,1,1] target=2
//op: 2

//ip:[1,2,3] target=3
//op:2

/*
1 ->1
1 2 ->3
1 2 3 ->6
1 2 3 4 ->10
1 2 3 4 5 ->15
1 2 3 4 5 6 ->21
1 2 3 4 5 6 7 ->28
1 2 3 4 5 6 7 8 ->36
2 ->2
2 3 ->5
2 3 4 ->9
2 3 4 5 ->14
2 3 4 5 6 ->20
2 3 4 5 6 7 ->27
2 3 4 5 6 7 8 ->35
3 ->3
3 4 ->7
3 4 5 ->12
3 4 5 6 ->18
3 4 5 6 7 ->25
3 4 5 6 7 8 ->33
4 ->4
4 5 ->9
4 5 6 ->15
4 5 6 7 ->22
4 5 6 7 8 ->30
5 ->5
5 6 ->11
5 6 7 ->18
5 6 7 8 ->26
6 ->6
6 7 ->13
6 7 8 ->21
7 ->7
7 8 ->15
8 ->8



count:2
*/