package ATIVIDADE03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/* Faça um Programa que peça um valor e mostre na tela se o valor
		   é positivo, negativo ou zero.*/
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Digite um Número: ");
		int num = s.nextInt();
		
		if (num > 0) {
			
			System.out.print("\nO Número é Positivo");
		
		}else if (num < 0) {
		
			System.out.print("\nO Número é Negativo");
			
		}else if (num == 0) {
		
			System.out.print("\nO Número é Zero");
			
		}
		
		s.close();
	}

}
