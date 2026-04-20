package Strings;

import java.util.HashMap;
import java.util.Map;

public class Frequency_Of_Each_Char_In_String {
	public static void printFrequency(String s) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (map.containsKey(ch)) {
				int val = map.get(ch);
				map.put(ch, val + 1);
			} else {
				map.put(ch, 1);

			}
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		printFrequency("Ganesh_Reddy_Reddem");// {a=1, R=2, s=1, d=4, e=4, G=1, h=1, y=1, m=1, n=1, _=2}
		printFrequency("Life Hurts ... Nature Heals...");//{ =4, a=2, e=3, f=1, H=2, i=1, L=1, l=1, .=6, N=1, r=2, s=2, t=2, u=2}


	}

}
