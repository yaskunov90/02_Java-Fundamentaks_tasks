package by.htp.project5.main;

import java.util.Scanner;

public class prog5 {

	
		public static void main(String[] args) {
			int a;
			int b;
			
			Scanner sc = new Scanner (System.in);
			
			System.out.println ("������� �������� ������� �����: ");
			while (!sc.hasNextInt()) {
				sc.next();
			}
			a = sc.nextInt();

			System.out.println ("������� �������� ������� �����: ");
			while (!sc.hasNextInt()) {
				sc.next();
			}
			b = sc.nextInt();
			
			if (a<b) {System.out.println ("������� ����� ����� " +a);}
			else {System.out.print("������� ����� ����� " +b);}
			
			
			
			
			
			
			
		}

	}
