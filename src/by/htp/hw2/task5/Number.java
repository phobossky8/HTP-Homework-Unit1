package by.htp.hw2.task5;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {

		int num;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Укажите целое количество чисел, необходимых для ввода: ");

		while (!sc.hasNextInt()) {
			System.out.print("Необходимо указать КОРРЕКТНОЕ количество чисел, необходимых для ввода: ");
			sc.next();
		}

		num = sc.nextInt();

		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			int n = i + 1;
			System.out.print("Введите " + n + "-е число: ");
			arr[i] = sc.nextInt();

			if (arr[i] % 2 == 0) {
				count1++;
			}

			if (arr[i] % 3 == 0) {
				count2++;
			}

			if (Math.abs(arr[i]) < 3) {
				count3++;
			}
		}

		System.out.println("Количество четных чисел: " + count1);
		System.out.println("Количество чисел, кратных 3-м: " + count2);
		System.out.println("Количество чисел, модуль которых меньше 3-х: " + count3);
	}

}
