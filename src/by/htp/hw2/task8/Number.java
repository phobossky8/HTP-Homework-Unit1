package by.htp.hw2.task8;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		double a;
		double b;
		double c;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("¬ведите 1-е число: ");

		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("¬ведите ¬≈ў≈—“¬≈ЌЌќ≈ число! ");
		}

		a = sc.nextDouble();

		System.out.print("¬ведите 2-е число: ");

		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("¬ведите ¬≈ў≈—“¬≈ЌЌќ≈ число! ");
		}

		b = sc.nextDouble();

		System.out.print("¬ведите 3-е число: ");

		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("¬ведите ¬≈ў≈—“¬≈ЌЌќ≈ число! ");
		}

		c = sc.nextDouble();

		if (a >= 0) {
			a = a * a;
		} else {
			a = Math.pow(a, 4);
		}

		if (b >= 0) {
			b = b * b;
		} else {
			b = Math.pow(b, 4);
		}

		if (c >= 0) {
			c = c * c;
		} else {
			c = Math.pow(c, 4);
		}

		System.out.println("–езультат действий с 1-м числом: " + a);
		System.out.println("–езультат действий с 2-м числом: " + b);
		System.out.println("–езультат действий с 3-м числом: " + c);

	}

}
