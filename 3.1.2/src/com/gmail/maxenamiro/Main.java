package com.gmail.maxenamiro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите номер квартиры: ");
		int kv = sc.nextInt();
		if ((kv < 1 || kv > 144)) {
			System.out.println("Квартиры не существует");
		} else {
			int etaj = 1 + ((kv - 1) % 36) / 4;
			System.out.println("Этаж " + etaj);
			int padik = 1 + (kv - 1) / 36;
			System.out.println("Подъезд " + padik);
		}

	}

}
