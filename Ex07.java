package ATIVIDADE03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// Fa�a um Programa que leia tr�s n�meros e mostre-os em ordem decrescente.
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Informe o 1� N�mero: ");
		int num1 = s.nextInt();
		
		System.out.print("Informe o 2� N�mero: ");
		int num2 = s.nextInt();
		
		System.out.print("Informe o 3� N�mero: ");
		int num3 = s.nextInt();
		
		if((num1 > num2) && (num1 > num3) && (num2 > num3)) {
				
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
			
		}else if((num1 > num2) && (num1 > num3) && (num3 > num2)) {
			
			System.out.println(num1);
			System.out.println(num3);
			System.out.println(num2);
			
		}else if((num2 > num1) && (num2 > num3) && (num1 > num3)) {
			
			System.out.println(num2);
			System.out.println(num1);
			System.out.println(num3);
			
		}else if((num2 > num1) && (num2 > num3) && (num3 > num1)) {
			
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num1);
			
		}else if((num3 > num1) && (num3 > num2) && (num1 > num2)) {
			
			System.out.println(num3);
			System.out.println(num1);
			System.out.println(num2);
			
		}else if((num3 > num1) && (num3 > num2) && (num2 > num1)) {
		
			System.out.println(num3);
			System.out.println(num2);
			System.out.println(num1);
			
		}else {
			
			System.out.println("Tem que ser N�meros Diferentes");
			
		}
		
		s.close();
	}

}
