package com.gmail.maxenamiro;

import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
		/*создать масив случайных чисел размеров 15 эл
		 * создать второй массив в два раза больше
		 * первые 15 эл должны быть равны эл первого массива
		 * а остальные эл заполнить удвоеннм значением начальных*/
		int a[] = new int[15];
		int b[] = new int[30];
		for (int i=0;i<a.length;i++){
		    a[i]=(int)(Math.random()*15);
		}
		        b=Arrays.copyOf(a,30);
		        System.arraycopy(a, 0, b , 15, 15);
		        for(int i=15; i<=29; i++) {
		            b[i] = b[i]*2 ;
		        }
		        System.out.println(Arrays.toString(b));
		    }

	}