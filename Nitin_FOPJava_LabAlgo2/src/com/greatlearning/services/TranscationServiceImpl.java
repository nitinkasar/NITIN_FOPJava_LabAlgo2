package com.greatlearning.services;

public class TranscationServiceImpl {

	public void search(int arr[], long target) {
		System.out.println("search to be done");
		long sum = 0;
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];
			if (sum == target) {
				System.out.println("Target achived");
				flag = 1;
			}
		}
		if (flag == 0) {
			System.out.println("Target not achived");
		}
	}

	public void search2(int arr[]) {

	}

}
