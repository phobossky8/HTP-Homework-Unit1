package by.htp.hw2.task3;

import java.util.Scanner;

public class NewYear {

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

		if (a > b) {
			System.out.print("������� ����� �: ");

			while (!sc.hasNextInt()) {
				sc.next();
				System.out.print("������� ����� �����! ");
			}
			c = sc.nextInt();

			int sum = a + b + c;
			System.out.print("����� - " + sum);
		} else if (a == b) {

			System.out.println("The end");

		} else {
			System.out.print("������� ����� �: ");

			while (!sc.hasNextInt()) {
				sc.next();
				System.out.print("������� ����� �����! ");
			}
			c = sc.nextInt();

			int sum = a + b + c;

			System.out.println("����� ����� ����� " + sum);
			System.out.println("����� ���!");

		}
	}

}
