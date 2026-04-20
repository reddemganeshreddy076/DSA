package Strings;

import java.util.HashMap;
import java.util.Map;

public class Frequency_Of_Words_In_String {
	public static void printFrequency(String s) {
		String[] words = s.split(" +");
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			if (map.containsKey(word)) {
				int count = map.get(word);
				map.put(word, count + 1);

			} else {
				map.put(word, 1);
			}

		}
		System.out.println(map);

	}

	public static void main(String[] args) {
		printFrequency(
				"if you fire the fire,fire will be fired , fire is the fire., i am the fire.. 😂 😜 😂 😜 😂 😜  ");
//		{fired=1, be=1, 😜=3, will=1, i=1, is=1, ,=1, am=1, the=3, fire,fire=1, fire=2, if=1, fire..=1, you=1, 😂=3, fire.,=1}

	}

}
