package by.htp.hw2.task2;

import java.util.Scanner;

public class SolveExpression {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		double res;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a = ");
		
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Enter CORRECT number! ");
		}

		a = sc.nextInt();

		System.out.print("Enter b = ");
		
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Enter CORRECT number! ");
		}

		b = sc.nextInt();

		System.out.print("Enter c = ");
		
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Enter CORRECT number! ");
		}

		c = sc.nextInt();

		res = (double) (a * a - (b - c) * (b - c) + Math.log(b * b + 1));

		System.out.println("result is " + res);
	}

}
