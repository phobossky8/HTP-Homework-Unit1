package by.htp.hw2.task6;

import java.util.Scanner;

public class Numbr {

	public static void main(String[] args) {
		int num;
		int count1 = 0;
		int count2 = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Укажите кол-во чисел для ввода: ");

		while (!sc.hasNextInt()) {
			System.out.print("Необходимо указать КОРРЕКТНОЕ количество чисел для ввода: ");
			sc.next();
		}

		num = sc.nextInt();

		double[] arr = new double[num];
		long[] arr2 = new long[num];

		for (int i = 0; i < num; i++) {
			int n = i + 1;
			System.out.print("Введите " + n + "-е число: ");
			arr[i] = sc.nextDouble();

			arr2[i] = (long) arr[i];
			System.out.println("Усеченное " + n + "-е число: " + arr2[i]);

			if (arr2[i] % 2 == 0) {
				count1++;
			}

			if (arr2[i] > 15) {
				count2++;
			}
		}

		System.out.println("Количество четных чисел: " + count1);
		System.out.println("Количество чисел, которые больше 15: " + count2);

	}

}
