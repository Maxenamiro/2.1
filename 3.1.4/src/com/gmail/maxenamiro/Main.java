package com.gmail.maxenamiro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите первую сторону треугольника");
		int a = sc.nextInt();
		System.out.println("Введите вторую сторону треугольника");
		int b = sc.nextInt();
		System.out.println("Введите третью сторону треугольника");
		int c = sc.nextInt();
		if ((a+b>c)&(a+c>b)&(c+b>a)){
			System.out.println("Такой треугольник существует");
		}
		else {
			System.out.println("Такого треугольника НЕ существует");
		}

	}

}