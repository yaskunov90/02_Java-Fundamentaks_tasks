package by.htp.project8.main;

import java.util.Scanner;

public class prog8 {

	public static void main(String[] args) {
		double A, B, x, y, z;

		Scanner sc = new Scanner(System.in);

		System.out.println("������� �������� �: ");
		while (!sc.hasNextDouble()) {
			sc.next();
		}
		A = sc.nextDouble();
		
		System.out.println("������� �������� B: ");
		while (!sc.hasNextDouble()) {
			sc.next();
		}
		B = sc.nextDouble();
		
		System.out.println("������� �������� x: ");
		while (!sc.hasNextDouble()) {
			sc.next();
		}
		x = sc.nextDouble();
		
		System.out.println("������� �������� y: ");
		while (!sc.hasNextDouble()) {
			sc.next();
		}
		y = sc.nextDouble();
		
		System.out.println("������� �������� z: ");
		while (!sc.hasNextDouble()) {
			sc.next();
		}
		z = sc.nextDouble();
		
		if ((A > x) && (B > y))
			System.out.println("�������.");
			else if ((A > y) && (B > x))
			System.out.println("�������.");
			else if ((A > x) && (B > z))
			System.out.println("�������.");
			else if ((A > z) && (B > x))
			System.out.println("�������.");
			else if ((A > y) && (B > z))
			System.out.println("�������.");
			else if ((A > z) && (B > y))
			System.out.println("�������.");
			else
			System.out.println("�� �������.");
		
		
		
		
	}

}
