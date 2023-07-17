package com.greatlearning.services;

public class TransactionServiceImpl {

	public void search(int arr[], long target) {
		//System.out.println("search to be done");
		long sum = 0;
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];
			int counter = i +1;
			if (sum >= target) {
				System.out.println("Target achived after " +counter +" transactions");
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("Given target is not achieved");
		}
	}

}
