package by.htp.project13.main;

import java.util.*;

public class prog13 {

	public static void main(String[] args) {
		double x;
		double sum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("¬ведите целое положительное число ");

		while (!sc.hasNextDouble()) {
			sc.next();
		}
		x = sc.nextDouble();

		while ((x-1)>=0) {sum=sum+(x-1); x--;}
			
			
			
		System.out.println("—умма чисел равна " + sum);

	}

}
