package com.gmail.maxenamiro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите текст: ");
		String text = sc.nextLine();
		sc.close();

		System.out.println(wordCalc(text));

	}

	private static int wordCalc(String text) {
		text = text.trim();
		String[] words = text.split(" ");
		return words.length;
	}
}
