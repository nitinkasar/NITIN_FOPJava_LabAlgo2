package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.services.BubbleSortImpl;
import com.greatlearning.services.NotesCount;

public class NotesMain {

	 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations ");
		
		int curSize = sc.nextInt();
		int[] notes = new int[curSize];
		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < notes.length; i++) {
			notes[i] = sc.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		BubbleSortImpl bubbleSortImpl = new BubbleSortImpl();
		bubbleSortImpl.bubblesort(notes);
		NotesCount notesCount = new NotesCount();
		notesCount.notesCountImpl(notes, amount);
	}

}
