package by.htp.hw2.task6;

import java.util.Scanner;

public class Numbr {

	public static void main(String[] args) {
		int num;
		int count1 = 0;
		int count2 = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("������� ���-�� ����� ��� �����: ");

		while (!sc.hasNextInt()) {
			System.out.print("���������� ������� ���������� ���������� ����� ��� �����: ");
			sc.next();
		}

		num = sc.nextInt();

		double[] arr = new double[num];
		long[] arr2 = new long[num];

		for (int i = 0; i < num; i++) {
			int n = i + 1;
			System.out.print("������� " + n + "-� �����: ");
			arr[i] = sc.nextDouble();

			arr2[i] = (long) arr[i];
			System.out.println("��������� " + n + "-� �����: " + arr2[i]);

			if (arr2[i] % 2 == 0) {
				count1++;
			}

			if (arr2[i] > 15) {
				count2++;
			}
		}

		System.out.println("���������� ������ �����: " + count1);
		System.out.println("���������� �����, ������� ������ 15: " + count2);

	}

}
