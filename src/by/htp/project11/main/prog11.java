package by.htp.project11.main;

import java.util.Scanner;

public class prog11 {

	public static void main(String[] args) {

		double a;
		double b;
		double h;
		double c;
		double x;
		double y;

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите начaльное значение отрезка а= ");
		while (!sc.hasNextDouble()) {
			sc.nextDouble();
		}
		a = sc.nextDouble();

		System.out.println("Введите конечное значение отрезка b= ");
		while (!sc.hasNextDouble()) {
			sc.nextDouble();
		}
		b = sc.nextDouble();

		System.out.println("Введите шаг отрезка h= ");
		while (!sc.hasNextDouble()) {
			sc.nextDouble();
		}
		h = sc.nextDouble();

		System.out.println("Введите точку х= ");
		while (!sc.hasNextDouble()) {
			sc.nextDouble();
		}
		x = sc.nextDouble();

		c = b - a;

		while (a <= b & h < c) {
			if (a + c <= b & x<c) {
				if (x >= a & x <= b) {
					if (x > 2) {
						y = x;
						System.out.println("Значение функции равно " + y);
					} else {
						y = -x;
						System.out.println("Значение функции равно " + y);
					}
					break;
				} else {
					System.out.println("Введенная величина х не принадлежит отрезку [a,b]");
					break;
				}
			}
			System.out.println("Шаг h больше, чем длина отрезка!");
		}
		
	}
}
