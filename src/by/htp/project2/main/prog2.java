package by.htp.project2.main;

import java.util.Scanner;

public class prog2 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		int rez;

		Scanner sc = new Scanner(System.in);

		System.out.println("������� a: ");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		a = sc.nextInt();

		System.out.println("������� b: ");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		b = sc.nextInt();

		System.out.println("������� c: ");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		c = sc.nextInt();

		System.out.println("������� d: ");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		d = sc.nextInt();

		if (c != 0 & d != 0) {
			rez = (a / c) * (b / d) - (((d * b) - c) / c * d);
			System.out.println("��������� ����� " + rez);
		} else {
			System.out.println("������� ������ �������� � � d");

		}

	}

}
