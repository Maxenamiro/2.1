package com.gmail.maxenamiro;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[20];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (1 + Math.random() * 20);
		}
		System.out.println("Введите число которое хотите найти: ");
		int number = sc.nextInt();
		int indexOfNumber = findElem(array, number);
		System.out.println(indexOfNumber);
		System.out.println(Arrays.toString(array));
	}

	static int findElem(int[] ar, int n) {
		int numInd = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == n) {
				numInd = i;
				break;
			} else
				numInd = -1;
		}
		return numInd;
	}
}
