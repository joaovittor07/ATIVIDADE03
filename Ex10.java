package ATIVIDADE03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// Fa�a um Programa que leia tr�s n�meros e mostre o maior e o menor deles.
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Insira o 1� N�mero: ");
		int num1 = s.nextInt();
		
		System.out.print("Insira o 2� N�mero: ");
		int num2 = s.nextInt();
		
		System.out.print("Insira o 3� N�mero: ");
		int num3 = s.nextInt();
		
		if ((num3 > num2) && (num3 > num1) && (num2 > num1)) {
			
			System.out.println("\nO 3� N�mero � o Maior");
			System.out.println("O 1� N�mero � o Menor");
			
		}else if ((num2 > num3) && (num2 > num1) && (num3 > num1)) {
			
			System.out.println("\nO 2� N�mero � o Maior");
			System.out.println("O 1� N�mero � o Menor");
			
		}else if ((num1 > num3) && (num1 > num2) && (num3 > num2)) {
			
			System.out.println("\nO 1� N�mero � o Maior");
			System.out.println("O 2� N�mero � o Menor");
			
		}else if ((num1 > num2) && (num1 > num3) && (num2 > num3)) {
			
			System.out.println("\nO 1� N�mero � o Maior");
			System.out.println("O 3� N�mero � o Menor");
		
		}else if ((num2 > num1) && (num2 > num3) && (num1 > num3)) {
			
			System.out.println("\nO 2� N�mero � o Maior");
			System.out.println("O 3� N�mero � o Menor");
		
		}else if ((num3 > num1) && (num3 > num2) && (num1 > num2)) {
			
			System.out.println("\nO 3� N�mero � o Maior");
			System.out.println("O 2� N�mero � o Menor");
		
		}
		
		s.close();
	}
}