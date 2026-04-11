package Strings;

import java.util.Arrays;

public class Remove_Extra_Spaces_In_Between_String {

	public static void removeSpace(String s) {
		String words[] = s.split(" +");
		String[] words2 = s.split("\\s+");
		System.out.println(Arrays.toString(words));
		System.out.println(Arrays.toString(words2));

	}

	public static void main(String[] args) {
		String string = " Looking like a king ";
		removeSpace(string);
		String s1 = "DS Is Easy";
		removeSpace(s1);
	}
}

//output:
//[, Looking, like, a, king]
//[DS, Is, Easy]

//These spaces are because of toString() method..