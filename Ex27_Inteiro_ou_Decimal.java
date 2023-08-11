package LISTA.DE.EXERCICIO2;

import java.util.Scanner;

public class Ex27_Inteiro_ou_Decimal {

	public static void main(String[] args) {
		
		/* Faça um Programa que peça um número e informe se o número é  
		   inteiro ou decimal. Dica: utilize uma função de arredondamento.*/

		Scanner s = new Scanner (System.in);
		
		System.out.print("Insira um Número: ");
		double num = s.nextDouble();
		
		if (num > Math.floor(num) ) {   // Só vai ler se for com virgula
			System.out.print("É um Número Decimal"); 
		}else {
			System.out.print("É um Númoro Inteiro");
		}
		
		
		
	}

}
