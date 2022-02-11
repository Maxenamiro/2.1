package com.gmail.maxenamiro;

import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in); 
			
			System.out.println("Радиус круга: 4"); 
			int r = 4; 
			System.out.print("Введите координату X: ");
			double x=sc.nextInt();
			System.out.print("Введите координату Y: ");
			double y=sc.nextInt();

			if (Math.sqrt(x*x+y*y) <= r) {
				System.out.print("Ваша точка лежит внутри круга");
			}
			else {
				System.out.print("Ваша точка НЕ лежит внутри круга");
			}
		sc.close();	
		}

	}
