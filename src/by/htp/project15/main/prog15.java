package by.htp.project15.main;

import java.util.*;

public class prog15 {

	public static void main(String[] args) {
		int x;
		int y;
		int nod;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите значение x: ");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		x = sc.nextInt();

		System.out.println("Введите значение y: ");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		y = sc.nextInt();
		
		if (x!=0 && y!=0) {
		if (x<y) {nod=x;}
		else {nod=y;}
		
		while (!((x%nod==0) && (y%nod==0))) 
		{nod--;}
		System.out.print("НОД равен " +nod);}
else {System.out.println ("НЕЛЬЗЯ ВВОДИТЬ 0!");}}
}
