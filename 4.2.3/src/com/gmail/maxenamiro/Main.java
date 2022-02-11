package com.gmail.maxenamiro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите ширину ");
		int w = sc.nextInt();
		if (w % 2 == 0) {
			w++;
		}
		for (int i = 0; i < w; i++) {
			for (int j = 0; j <= w; j++) {
				if ((j < w / 2 - Math.abs(w / 2 - i)) || (j > w / 2 + Math.abs(w / 2 - i))) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
