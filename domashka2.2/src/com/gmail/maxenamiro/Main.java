package com.gmail.maxenamiro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("vvodite necelye chisla cherez zapiatyu");
		System.out.println("pervaya storona");
		double a = sc.nextDouble();
		System.out.println("vtoraya storona");
		double b = sc.nextDouble();
		System.out.println("tretaya storona");
		double c = sc.nextDouble();
		double p = (a + b + c) / 2;
		double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		System.out.println("ploschad treygolnika = ");
		System.out.println(s);

	}

}
