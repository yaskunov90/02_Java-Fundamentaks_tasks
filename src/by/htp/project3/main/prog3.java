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

		System.out.println("������� �������� �: ");

		while (!sc.hasNextLong()) {
			sc.next();
		}
		x = sc.nextLong();
		
		y = x % 8; //���������� ���������� ���
		z = x / 8; //���������� ���������� ����
		System.out.println("��� " + y); //������� ���������� ���
			
		if (z>=1024) {
			
			h = z/1024; //���������� ���������� �����
			j = z % 1024; //���������� ������� ����
			System.out.println("���� " + j);
				}
		else {System.out.println("���� " + z);}
		
		
		if (h>=1024) {
			k = h / 1024; //���������� ���������� �����
			p = h % 1024; //���������� ������� �����
			System.out.println("����� " + p);
								}
		else {System.out.println ("����� "+h);}
		
		if (h>1024) {
			b = h / 1024; //���������� ���������� �����
			n = h % 1024; //���������� ������� �����
					System.out.println("����� " + n);
								}
		else {System.out.println ("M���� "+k);}
		
		if (b>1024) {
			r = h / 1024; //���������� ���������� �����
			t = h % 1024; //���������� ������� �����
					System.out.println("����� " + t);
								}
		else {System.out.println ("����� "+b);}
		
		
		
	
	}

}
