package com.gmail.maxenamiro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("введите год");
		int year = sc.nextInt();
		if (((year % 4 == 0) & (year % 100 != 0) || (year % 400 == 0))) {
			System.out.println("Это високосный год");

		} else {
			System.out.println("Это НЕ високосный год");

		}
	}

}
