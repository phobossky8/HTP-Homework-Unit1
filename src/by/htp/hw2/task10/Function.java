package by.htp.hw2.task10;

import java.util.Scanner;

public class Function {

	public static void main(String[] args) {
		double x;
		double func;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("������� �: ");

		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("������� ������������ �����! ");
		}
		
		x = sc.nextDouble();

		if (x <= -3) {
			func = 9;
			System.out.println("F(x) = " + func);
		} else if (x > 3) {
			func = 1 / (x * x + 1);
			System.out.println("F(x) = " + func);
		} else {
			System.out.println("������!!!");
		}

	}

}
