package by.htp.project7.main;

import java.util.*;

public class prog7 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int i = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("������� ����� � ");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		a = sc.nextInt();

		System.out.println("������� ����� b ");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		b = sc.nextInt();

		System.out.println("������� ����� c ");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		c = sc.nextInt();

		if (a < 0) {
			i++;
		}

		if (b < 0) {
			i++;
		}
		if (c < 0) {
			i++;
		}

		System.out.println("������� ������������� ����� - " + i);

	}
}
