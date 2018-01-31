package by.htp.hw2.task4;

import java.util.Scanner;

public class Foootball {

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

		if (a == b) {
			System.out.println("скоро Новый год!");

		} else {
			System.out.print("Введите число с: ");

			while (!sc.hasNextInt()) {
				sc.next();
				System.out.print("Введите ЦЕЛОЕ число! ");
			}

			c = sc.nextInt();

			int sum = a + b + c;
			int rez = a * a + b * b;

			System.out.println("Сумма чисел равна " + sum);
			System.out.println("Выражение равно " + rez);
			System.out.println("Моя любимая футбольная команда - Барселона");
		}

	}

}
