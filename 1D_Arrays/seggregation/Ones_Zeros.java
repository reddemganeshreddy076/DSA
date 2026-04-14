package Arrays1D.Seggregation;

import java.util.Arrays;

public class Ones_Zeros {
	public static int[] seggregate(int[] a) {
		int res[] = new int[a.length];
		int count = 0;
		for (int ele : a)
			if (ele == 1)
				count++;
		for (int i = 0; i < count; i++)
			res[i] = 1;
		return res;

	}

	public static void main(String[] args) {
		int res[] = seggregate(new int[] { 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1 });
		System.out.println(Arrays.toString(res));
	}

}

//[1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0]
