package ATIVIDADE03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/* Fa�a um Programa que pe�a um valor e mostre na tela se o valor
		   � positivo, negativo ou zero.*/
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Digite um N�mero: ");
		int num = s.nextInt();
		
		if (num > 0) {
			
			System.out.print("\nO N�mero � Positivo");
		
		}else if (num < 0) {
		
			System.out.print("\nO N�mero � Negativo");
			
		}else if (num == 0) {
		
			System.out.print("\nO N�mero � Zero");
			
		}
		
		s.close();
	}

}
