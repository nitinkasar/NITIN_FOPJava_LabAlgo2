package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.services.PaymentServiceImpl;

public class PaymentMain {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("*************************************");
		System.out.println("Enter the size of currency denominations");
		PaymentServiceImpl paymentService = new PaymentServiceImpl();
		int size = s.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the currency denomination values: ");
		System.out.println();

		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}

		System.out.println("Enter the amount you want to pay: ");

		int amount = s.nextInt();
		paymentService.paymentApproch(arr, amount);

	}

}
