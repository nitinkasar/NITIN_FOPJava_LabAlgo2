package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.services.TransactionServiceImpl;

public class TransactionMain {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transcation array");
		TransactionServiceImpl service = new TransactionServiceImpl();
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter values of array:");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the total no of targets that needs to be achieved");

		int targetNo = sc.nextInt();

		while (targetNo-- != 0) {
			long target;
			System.out.println("Enter the value of target");
			target = sc.nextInt();
			service.search(arr, target);
		}
	}
}
