package by.htp.project7.main;

import java.util.*;

public class prog7 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int i = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("¬ведите число а ");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		a = sc.nextInt();

		System.out.println("¬ведите число b ");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		b = sc.nextInt();

		System.out.println("¬ведите число c ");
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

		System.out.println("¬ведено отрицательных чисел - " + i);

	}
}
