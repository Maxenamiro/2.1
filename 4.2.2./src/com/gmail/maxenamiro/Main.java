package com.gmail.maxenamiro;

public class Main {

	public static void main(String[] args) {

		for (int j = 2; j <= 100; j++) {
			boolean chislo = false;

			for (int i = 2; i * i <= j; i++) {
				chislo = (j % i == 0);
				if (chislo) {
					break;
				}
			}
			if (!chislo) {
				System.out.print(j + " ");
			}
		}
	}
}
