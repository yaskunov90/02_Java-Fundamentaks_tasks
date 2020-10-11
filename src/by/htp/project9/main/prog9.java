package by.htp.project9.main;

import java.util.*;

public class prog9 {

	public static void main(String[] args) {

		double x;
		double y;

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите значение х");
		while (!sc.hasNextDouble()) {
			sc.next();
		}
		x = sc.nextDouble();
		
		if (x <= 3) {
			y = Math.pow(x, 2) - 3 * x + 9;
			System.out.println("Значение функции равно " + y);
		}
		
		if (x > 3) {
			y = 1 / (Math.pow(x, 3) + 6);
			System.out.println("Значение функции равно " + y);

		}
	}
}

