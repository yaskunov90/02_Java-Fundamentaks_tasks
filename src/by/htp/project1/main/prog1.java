package by.htp.project1.main;

import java.util.*;

public class prog1 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double rez;

		Scanner sc = new Scanner(System.in);

		System.out.print("������� a: ");
		while (!sc.hasNextDouble()) {
			sc.next();
		}
		a = sc.nextDouble();

		System.out.print("������� b: ");
		while (!sc.hasNextDouble()) {
			sc.next();
		}
		b = sc.nextDouble();

		System.out.print("������� �: ");
		while (!sc.hasNextDouble()) {
			sc.next();
		}
		c = sc.nextDouble();

		if (a != 0) {
			rez = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, (-2));
			System.out.print("��������� ����� " + rez);
		} else {
			System.out.println("������� ������ �������� � ");

			System.out.print("������� a: ");
			while (!sc.hasNextDouble()) {
				sc.next();
			}
			a = sc.nextDouble();

		}

	}

}
