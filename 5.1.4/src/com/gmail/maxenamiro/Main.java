package com.gmail.maxenamiro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Введите строку текста с клавиатуры
		 *  — реализуйте программу для  возможности подсчета количества символа — 'b' в этой строке,
		 *   с выводом  */
		Scanner sc=new Scanner(System.in);
		System.out.println("Введите текст: ");
        String text = sc.nextLine();
        char[] ch=text.toCharArray();
        char b = 'b';
        int count= 0;
        for(int a: ch){
            if (a == b)
                count++;
        	}
        System.out.println(count);
    	}

	}
