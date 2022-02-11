package com.gmail.maxenamiro;

public class Main {
	public static void main(String[] args) {
		int mass1[] = new int[] { 0, 5, 2, 4, 7, 1, 3, 19 };
		int n = 0;
		for (int x = 0; x < mass1.length; x++) {
			if (mass1[x] % 2 - 1 == 0) {
				n = mass1[x];
				System.out.println("Нечетные элементы = " + n);
			}
		}
	}
}
