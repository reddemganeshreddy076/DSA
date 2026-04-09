package Dups;
import java.util.Arrays;
public class RemoveDuplicatesInArray {
	public static void removeDuplicates(int[] a) {
		int inf = Integer.MIN_VALUE;
		int dups = 0;
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]!=inf)
			for (int j = i+1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a[j] = inf;
					dups++;
				}
			}
		}
		
		
		int res[] = new int[a.length-dups];
		for(int i=0,j=0;i<a.length;i++) {
			if(a[i]!=inf) {
				res[j++]=a[i];
			}
		}
		System.out.println(Arrays.toString(res));
	}

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
		int arr[]= {1,2,3,1,2,3,1,2,3,4};
		removeDuplicates(arr);
		
	}

}
