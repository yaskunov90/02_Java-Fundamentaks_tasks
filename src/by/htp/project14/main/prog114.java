package by.htp.project14.main;

import java.util.Scanner;

public class prog114 {

	public static void main(String[] args) {
		double x;
		double sum=1;

		Scanner sc = new Scanner(System.in);

		System.out.println("������� ����� ");

		while (!sc.hasNextDouble()) {
			sc.next();
		}
		x = sc.nextDouble();

		for (int i = 1; i <= x; i++) {
		     sum = sum * i;
		  }

		System.out.println("��������� ����� ����� " + sum);

	}

}
