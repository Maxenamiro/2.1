package com.gmail.maxenamiro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How much money do you have?");
		double money = scan.nextDouble();
		if (money / 1000000000 < 1) {
			String textMoney = String.format("%.2f", money);
			char[] numbers = textMoney.toCharArray();
			int k = textMoney.indexOf(',');
			System.out.print("You have ");
			for (int i = 0; i < numbers.length; i++) {
				if (k == 8 || k == 5 || k == 2 || k == -1) {
					if (numbers[i] == '1') {
						if (numbers[i + 1] == '0') {
							System.out.print("ten ");
						} else if (numbers[i + 1] == '1') {
							System.out.print("eleven ");
						} else if (numbers[i + 1] == '2') {
							System.out.print("twelve ");
						} else if (numbers[i + 1] == '3') {
							System.out.print("thirteen ");
						} else if (numbers[i + 1] == '4') {
							System.out.print("fourteen ");
						} else if (numbers[i + 1] == '5') {
							System.out.print("fifteen ");
						} else if (numbers[i + 1] == '6') {
							System.out.print("sixteen ");
						} else if (numbers[i + 1] == '7') {
							System.out.print("seventeen ");
						} else if (numbers[i + 1] == '8') {
							System.out.print("eighteen ");
						} else if (numbers[i + 1] == '9') {
							System.out.print("nineteen ");
						}
					} else if (numbers[i] == '2') {
						System.out.print("twenty ");
					} else if (numbers[i] == '3') {
						System.out.print("thirty ");
					} else if (numbers[i] == '4') {
						System.out.print("forty ");
					} else if (numbers[i] == '5') {
						System.out.print("fifty ");
					} else if (numbers[i] == '6') {
						System.out.print("sixty ");
					} else if (numbers[i] == '7') {
						System.out.print("seventy ");
					} else if (numbers[i] == '8') {
						System.out.print("eighty ");
					} else if (numbers[i] == '9') {
						System.out.print("ninety ");
					}
				} else if ((k == 9 || k == 6 || k == 3)
						|| ((k == 7 || k == 4 || k == 1 || k == -2) && (i == 0 || numbers[i - 1] != '1'))) {
					if (numbers[i] == '1') {
						System.out.print("one ");
					} else if (numbers[i] == '2') {
						System.out.print("two ");
					} else if (numbers[i] == '3') {
						System.out.print("three ");
					} else if (numbers[i] == '4') {
						System.out.print("four ");
					} else if (numbers[i] == '5') {
						System.out.print("five ");
					} else if (numbers[i] == '6') {
						System.out.print("six ");
					} else if (numbers[i] == '7') {
						System.out.print("seven ");
					} else if (numbers[i] == '8') {
						System.out.print("eight ");
					} else if (numbers[i] == '9') {
						System.out.print("nine ");
					}
				}

				if ((k == 9 || k == 6 || k == 3) && numbers[i] != '0') {
					System.out.print("hundred ");
				} else if (k == 7 && numbers[i] != '0') {
					System.out.print("million ");
				} else if (k == 4 && numbers[i] != '0') {
					System.out.print("thousand ");
				} else if (k == 0) {
					System.out.print("dollars ");
				} else if (k == -2 && (numbers[i] != '0' || numbers[i - 1] != '0')) {
					System.out.print("cent");
				}
				k--;
			}
		}
	}
}
