package by.htp.hw2.task4;

import java.util.Scanner;

public class Foootball {

	public static void main(String[] args) {

		int a;
		int b;
		int c;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("������� ����� �: ");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("������� ����� �����! ");
		}

		a = sc.nextInt();

		System.out.print("������� ����� b: ");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("������� ����� �����! ");
		}

		b = sc.nextInt();

		if (a == b) {
			System.out.println("����� ����� ���!");

		} else {
			System.out.print("������� ����� �: ");

			while (!sc.hasNextInt()) {
				sc.next();
				System.out.print("������� ����� �����! ");
			}

			c = sc.nextInt();

			int sum = a + b + c;
			int rez = a * a + b * b;

			System.out.println("����� ����� ����� " + sum);
			System.out.println("��������� ����� " + rez);
			System.out.println("��� ������� ���������� ������� - ���������");
		}

	}

}
