package by.htp.project4.main;

import java.util.Scanner;

public class prog4 {

	public static void main(String[] args) {
		int a;
		int b;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("Введите значение первого числа: ");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		a = sc.nextInt();

		System.out.println ("Введите значение второго числа: ");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		b = sc.nextInt();
		
		if (a<b) {System.out.println ("7");}
		else {System.out.print("8");}
		
		
		
		
		
		
		
	}

}
