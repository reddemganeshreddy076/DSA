package Arrays1D;

import java.util.Scanner;

public class Currency_Dimensions {
	public static void findNotes(int[] notes, int amount) {
		for (int i = 0; i < notes.length && amount != 0; i++) {
			int count = amount / notes[i];
			if (count > 0) {
				System.out.println(notes[i] + "->" + count);
				amount = amount % notes[i];
			}

		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter no of notes : ");
		int[] notes = new int[scanner.nextInt()];
		
		//Enter your proiority wise
		System.out.println("Enter notes");
		for (int i = 0; i < notes.length; i++)
			notes[i] = scanner.nextInt();
		System.out.println("Enter amount : ");
		int amount = scanner.nextInt();
		findNotes(notes, amount);
		scanner.close();
	}

}
//
//
//enter no of notes : 
//6
//Enter notes
//500
//200
//100
//50
//20
//10
//Enter amount : 
//12490
//500->24
//200->2
//50->1
//20->2
