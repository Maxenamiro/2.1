package com.gmail.maxenamiro;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите длину массива: ");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Введите элементы массива:");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		System.out.print("Вот такой массив получился:");
		for (int i = 0; i < size; i++) {
			System.out.print(" " + array[i]);
		}
		System.out.println();
	}
}
