package by.htp.hw2.task8;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		double a;
		double b;
		double c;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("������� 1-� �����: ");

		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("������� ������������ �����! ");
		}

		a = sc.nextDouble();

		System.out.print("������� 2-� �����: ");

		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("������� ������������ �����! ");
		}

		b = sc.nextDouble();

		System.out.print("������� 3-� �����: ");

		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("������� ������������ �����! ");
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

		System.out.println("��������� �������� � 1-� ������: " + a);
		System.out.println("��������� �������� � 2-� ������: " + b);
		System.out.println("��������� �������� � 3-� ������: " + c);

	}

}
