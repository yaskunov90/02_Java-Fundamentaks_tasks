package by.htp.project6.main;

import java.util.*;

public class prog6 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;

		Scanner sc = new Scanner(System.in);

		System.out.println("������� �������� ������� ����: ");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		a = sc.nextInt();

		System.out.println("������� �������� ������� ����: ");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		b = sc.nextInt();

		c = 180 - (a + b);

		if (a + b + c == 180 & a > 0 & b > 0 & c > 0) {

			if (c == 90 | a == 90 | b == 90) {
				System.out.println("����� ����������� ���������� � �� �������������!");

			} else {
				if (c > 0 & c < 180) {
					System.out.println("����� ����������� ����������!");

				} else {
					System.out.println("������ ������������ �� ����������!");

				}

			}

		} else {
			System.out.println("������ ������������ �� ����������!");
		}
	}
}
