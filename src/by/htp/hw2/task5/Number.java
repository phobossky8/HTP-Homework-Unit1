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

		System.out.print("������� ����� ���������� �����, ����������� ��� �����: ");

		while (!sc.hasNextInt()) {
			System.out.print("���������� ������� ���������� ���������� �����, ����������� ��� �����: ");
			sc.next();
		}

		num = sc.nextInt();

		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			int n = i + 1;
			System.out.print("������� " + n + "-� �����: ");
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

		System.out.println("���������� ������ �����: " + count1);
		System.out.println("���������� �����, ������� 3-�: " + count2);
		System.out.println("���������� �����, ������ ������� ������ 3-�: " + count3);
	}

}
