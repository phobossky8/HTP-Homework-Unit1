package by.htp.hw2.task7;

import java.util.Scanner;

public class Formula {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;
		double rez;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите число а: ");
		
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Введите ВЕЩЕСТВЕННОЕ число!");
		}
		
		a = sc.nextDouble();
		
		System.out.print("Введите число b: ");

		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Введите ВЕЩЕСТВЕННОЕ число! ");
		}
		
		b = sc.nextDouble();
		
		System.out.print("Введите число c: ");

		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Введите ВЕЩЕСТВЕННОЕ число! ");
		}
		
		c = sc.nextDouble();
		
		System.out.print("Введите число d: ");

		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Введите ВЕЩЕСТВЕННОЕ число! ");
		}
		
		d = sc.nextDouble();
		
		rez = (a / c) * (b / d) - (a * b - c) / (c * d);
		
		System.out.println("Результат равен: " + rez);

	}

}
