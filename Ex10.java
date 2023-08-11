package ATIVIDADE03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// Faça um Programa que leia três números e mostre o maior e o menor deles.
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Insira o 1º Número: ");
		int num1 = s.nextInt();
		
		System.out.print("Insira o 2º Número: ");
		int num2 = s.nextInt();
		
		System.out.print("Insira o 3º Número: ");
		int num3 = s.nextInt();
		
		if ((num3 > num2) && (num3 > num1) && (num2 > num1)) {
			
			System.out.println("\nO 3º Número é o Maior");
			System.out.println("O 1º Número é o Menor");
			
		}else if ((num2 > num3) && (num2 > num1) && (num3 > num1)) {
			
			System.out.println("\nO 2º Número é o Maior");
			System.out.println("O 1º Número é o Menor");
			
		}else if ((num1 > num3) && (num1 > num2) && (num3 > num2)) {
			
			System.out.println("\nO 1º Número é o Maior");
			System.out.println("O 2º Número é o Menor");
			
		}else if ((num1 > num2) && (num1 > num3) && (num2 > num3)) {
			
			System.out.println("\nO 1º Número é o Maior");
			System.out.println("O 3º Número é o Menor");
		
		}else if ((num2 > num1) && (num2 > num3) && (num1 > num3)) {
			
			System.out.println("\nO 2º Número é o Maior");
			System.out.println("O 3º Número é o Menor");
		
		}else if ((num3 > num1) && (num3 > num2) && (num1 > num2)) {
			
			System.out.println("\nO 3º Número é o Maior");
			System.out.println("O 2º Número é o Menor");
		
		}
		
		s.close();
	}
}