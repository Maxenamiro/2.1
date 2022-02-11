package com.gmail.maxenamiro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("введите высоту фигуры");
		int v = sc.nextInt();
		System.out.println("введите ширину фигуры");
		int sh = sc.nextInt();

		for (int i = 0; i < v; i++) {
			for (int j = 1; j < sh; j++) {
				if ((i == 0) || (i == v-1) || (j == 1)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println("*");
		}
	}
}
