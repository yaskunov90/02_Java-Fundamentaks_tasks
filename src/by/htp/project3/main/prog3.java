package by.htp.project3.main;

import java.util.Scanner;

public class prog3 {

	public static void main(String[] args) {

		long x;
		long y=0;
		long z=0;
		long p=0;
		long k=0;
		long h=0;
		long j=0;
		long b=0;
		long n=0;
		long r=0;
		long t=0;

		Scanner sc = new Scanner(System.in);

		System.out.println("¬ведите значение х: ");

		while (!sc.hasNextLong()) {
			sc.next();
		}
		x = sc.nextLong();
		
		y = x % 8; //определ€ем количество бит
		z = x / 8; //определ€ем количество байт
		System.out.println("Ѕит " + y); //выводим количество бит
			
		if (z>=1024) {
			
			h = z/1024; //определ€ет количество  байт
			j = z % 1024; //определ€ем остаток байт
			System.out.println("Ѕайт " + j);
				}
		else {System.out.println("Ѕайт " + z);}
		
		
		if (h>=1024) {
			k = h / 1024; //определ€ем количество ћбайт
			p = h % 1024; //определ€ем остаток  байт
			System.out.println(" байт " + p);
								}
		else {System.out.println (" байт "+h);}
		
		if (h>1024) {
			b = h / 1024; //определ€ем количество ћбайт
			n = h % 1024; //определ€ем остаток  байт
					System.out.println("ћбайт " + n);
								}
		else {System.out.println ("Mбайт "+k);}
		
		if (b>1024) {
			r = h / 1024; //определ€ем количество √байт
			t = h % 1024; //определ€ем остаток √байт
					System.out.println("√байт " + t);
								}
		else {System.out.println ("√байт "+b);}
		
		
		
	
	}

}
