package Strings;

public class Binary_To_Integer {

	public static int convert(String bin) {
		int n = Integer.parseInt(bin);
		int sum = 0;
		int prod = 1;
		while (n != 0) {
			int last = n % 10;
			sum += last * prod;
			prod = prod * 2;
			n /= 10;
		}
		return sum;
	}
	public static void main(String[] args) {
		String bin1 = "010";
		System.out.println(convert(bin1));// 2
		String bin2 = "101010";
		System.out.println(convert(bin2));// 42
		String bin3 = "1011110";
		System.out.println(convert(bin3));// 94
		String bin4 = "101011110";
		System.out.println(convert(bin4));// 350
	}
}
