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
		
		System.out.print("������� ����� �: ");
		
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("������� ������������ �����!");
		}
		
		a = sc.nextDouble();
		
		System.out.print("������� ����� b: ");

		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("������� ������������ �����! ");
		}
		
		b = sc.nextDouble();
		
		System.out.print("������� ����� c: ");

		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("������� ������������ �����! ");
		}
		
		c = sc.nextDouble();
		
		System.out.print("������� ����� d: ");

		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("������� ������������ �����! ");
		}
		
		d = sc.nextDouble();
		
		rez = (a / c) * (b / d) - (a * b - c) / (c * d);
		
		System.out.println("��������� �����: " + rez);

	}

}
