package com.gmail.maxenamiro;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner chisla = new Scanner(System.in);
		System.out.println("vvedite chisla");
		int i = chisla.nextInt();
		int a = i / 10000;
		System.out.println(a);
		int b = i % 10000 / 1000;
		System.out.println(b);
		int c = i % 1000 / 100;
		System.out.println(c);
		int d = i % 100 / 10;
		System.out.println(d);
		int e = i % 10 / 1;
		System.out.println(e);
	}
}