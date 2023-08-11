package ATIVIDADE03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// Faça um Programa que leia três números e mostre-os em ordem decrescente.
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Informe o 1º Número: ");
		int num1 = s.nextInt();
		
		System.out.print("Informe o 2º Número: ");
		int num2 = s.nextInt();
		
		System.out.print("Informe o 3º Número: ");
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
			
			System.out.println("Tem que ser Números Diferentes");
			
		}
		
		s.close();
	}

}
