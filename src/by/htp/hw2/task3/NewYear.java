package by.htp.hw2.task3;

import java.util.Scanner;

public class NewYear {

	public static void main(String[] args) {

		int a;
		int b;
		int c;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите число а: ");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Введите ЦЕЛОЕ число! ");
		}

		a = sc.nextInt();

		System.out.print("Введите число b: ");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Введите ЦЕЛОЕ число! ");
		}
		b = sc.nextInt();

		if (a > b) {
			System.out.print("Введите число с: ");

			while (!sc.hasNextInt()) {
				sc.next();
				System.out.print("Введите ЦЕЛОЕ число! ");
			}
			c = sc.nextInt();

			int sum = a + b + c;
			System.out.print("Сумма - " + sum);
		} else if (a == b) {

			System.out.println("The end");

		} else {
			System.out.print("Введите число с: ");

			while (!sc.hasNextInt()) {
				sc.next();
				System.out.print("Введите ЦЕЛОЕ число! ");
			}
			c = sc.nextInt();

			int sum = a + b + c;

			System.out.println("Сумма чисел равна " + sum);
			System.out.println("Новый год!");

		}
	}

}
