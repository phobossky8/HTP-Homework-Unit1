package by.htp.hw2.task9;

import java.util.Scanner;

public class Func {

	public static void main(String[] args) {
		int x;
		int a;
		int b;
		int h;
		double func;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите минимальное значение отрезка: ");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Введите ЦЕЛОЕ число!");
		}
		
		a = sc.nextInt();

		System.out.print("Введите максимальное значение отрезка: ");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Введите ЦЕЛОЕ число! ");
		}
		
		b = sc.nextInt();

		System.out.print("Введите шаг, с которым будут приниматься значения: ");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Введите ЦЕЛОЕ число! ");
		}
		
		h = sc.nextInt();

		x = a; //присваиваем, чтобы начать проверять с первого значения на отрезке

		while (x <= b) {
			System.out.print("x = " + x + "   ");
			func = 2 * Math.tan(x / 2) + 1;
			System.out.println("F(x) = " + func);
			x = x + h;
		}
	}

}
