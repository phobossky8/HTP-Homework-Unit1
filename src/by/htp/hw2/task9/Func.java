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

		System.out.print("������� ����������� �������� �������: ");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("������� ����� �����!");
		}
		
		a = sc.nextInt();

		System.out.print("������� ������������ �������� �������: ");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("������� ����� �����! ");
		}
		
		b = sc.nextInt();

		System.out.print("������� ���, � ������� ����� ����������� ��������: ");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("������� ����� �����! ");
		}
		
		h = sc.nextInt();

		x = a; //�����������, ����� ������ ��������� � ������� �������� �� �������

		while (x <= b) {
			System.out.print("x = " + x + "   ");
			func = 2 * Math.tan(x / 2) + 1;
			System.out.println("F(x) = " + func);
			x = x + h;
		}
	}

}
