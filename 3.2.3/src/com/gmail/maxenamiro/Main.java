package com.gmail.maxenamiro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double xA = 0;
		double yA = 0;
		double xB = 4;
		double yB = 4;
		double xC = 6;
		double yC = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите Х координату точки: ");
		double xP = sc.nextDouble();
		System.out.println("Введите Y координату точки: ");
		double yP = sc.nextDouble();
		sc.close();
		double s1 = (xA - xP) * (yB - yA) - (xB - xA) * (yA - yP);
		double s2 = (xB - xP) * (yC - yB) - (xC - xB) * (yB - yP);
		double s3 = (xC - xP) * (yA - yC) - (xA - xC) * (yC - yP);

		if ((s1 >= 0 && s2 >= 0 && s3 >= 0) || (s1 <= 0 && s2 <= 0 && s3 <= 0)) {
			System.out.println("Точка принадлежит треугольнику");
		} else {
			System.out.println("Точка не принадлежит треугольнику");
		}
	}

}
