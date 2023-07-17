package com.greatlearning.services;

public class BubbleSortImpl {

	public void bubblesort(int[] notes) {

		int n = notes.length;
		
		for (int i = 0; i < n - 1; i++) {
			
			for (int j = 0; j < n - i - 1; j++) {
				if (notes[j] < notes[j + 1]) {
					int temp = notes[j];
					notes[j] = notes[j + 1];
					notes[j + 1] = temp;
				}
			}
		}
	}

}
