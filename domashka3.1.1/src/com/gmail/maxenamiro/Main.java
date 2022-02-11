package com.gmail.maxenamiro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;
		int max;
		System.out.println("Vvedite pervoe chislo ");
		a = sc.nextInt();
		System.out.println("Vvedite vtotoe chislo ");
		b = sc.nextInt();
		System.out.println("Vvedite tretee chislo ");
		c = sc.nextInt();
		System.out.println("Vvedite chetvertoe chislo ");
		d = sc.nextInt();

		max = a;
		if (b > max) {
			max = b;

		}
		if (c > max) {
			max = c;
		}
		if (d > max) {
			max = d;
		}
		System.out.println("max = " + max);
	}

}
