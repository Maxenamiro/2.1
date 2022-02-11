package com.gmail.maxenamiro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите ширину ");
		int sh = sc.nextInt();
		System.out.println("Веедите высоту ");
		int vysota = sc.nextInt();
		ygolnik(sh, vysota);
	}

	public static void ygolnik(int a, int b) {
		for (int i = 1; i <= b; i++) {
			for (int j = 1; j <= a; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
