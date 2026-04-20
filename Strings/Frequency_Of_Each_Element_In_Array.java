package Strings;

import java.util.*;

public class Frequency_Of_Each_Element_In_Array {
	public static void printFrequency(int[] a) {
		int n = a.length;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int ele = a[i];
			if (map.containsKey(ele)) {
				int count = map.get(ele);
				map.put(ele, count + 1);
			} else {
				map.put(ele, 1);
			}
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		printFrequency(new int[] { 1, 2, 1, 12, 1, 1, 2, 3, 3, 4, 5, 6, 7, 1212 });
//{1=4, 2=2, 3=2, 4=1, 5=1, 6=1, 7=1, 12=1, 1212=1}

	}

}
