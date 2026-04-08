package Arrays_2D;

//import java.util.Arrays;

public class Traverse_2D_With_Cmds {
	public static int traverse(int[][] a, String[] cmds) {
//		if they ask destination element

		int r = 0;
		int c = 0;
//		started with first element

		for (int i = 0; i < cmds.length; i++) {
			String direction = cmds[i];
			switch (direction.toLowerCase()) {
			
			case "right":
				if (r >= 0 && r < a[0].length - 1)
					c++;
				break;
				
			case "left":
				if(r > 0 && r < a[0].length)
					c--;
				break;
			case "up":
				if(c>0 && c<a.length)
					r--;
				break;
			case "down":
				if(c>=0 && c<a.length-1)
					r++;

			}
		}

		return a[r][c];

	}

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		String[] cmds = { "right", "left", "left", "left", "right", "up", "down", "down" };
//		System.out.println(Arrays.toString(traverse(a)));
		System.out.println(traverse(a, cmds));

	}
}

//o/p : 7

