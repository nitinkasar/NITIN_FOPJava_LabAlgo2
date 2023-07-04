package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.services.TranscationServiceImpl;

public class TransactionMain {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Transcation to be entered");
		System.out.println("enter the size of transcation array");
		TranscationServiceImpl service = new TranscationServiceImpl();
		int size = s.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter values of array:");

		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}

		System.out.println("Enter the total no of target that need to be achieved");

		int targetNo = s.nextInt();

		while (targetNo-- != 0) {
			long target;
			System.out.println("enter the value of target");
			target = s.nextInt();
			service.search(arr, target);
		}

	}

}
