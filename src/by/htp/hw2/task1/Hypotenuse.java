package by.htp.hw2.task1;

import java.util.Scanner;

public class Hypotenuse {

	public static void main(String[] args) {
		int a;
		int b;
		double hyp;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first cathetus  = ");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Enter CORRECT number! ");
		}

		a = sc.nextInt();

		System.out.print("Enter second cathetus = ");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Enter CORRECT number! ");
		}

		b = sc.nextInt();

		hyp = (double) Math.sqrt(a * a + b * b);

		System.out.println("hypotenuse = " + hyp);

	}
}
