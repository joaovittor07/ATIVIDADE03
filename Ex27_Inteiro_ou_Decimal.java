package LISTA.DE.EXERCICIO2;

import java.util.Scanner;

public class Ex27_Inteiro_ou_Decimal {

	public static void main(String[] args) {
		
		/* Fa�a um Programa que pe�a um n�mero e informe se o n�mero �  
		   inteiro ou decimal. Dica: utilize uma fun��o de arredondamento.*/

		Scanner s = new Scanner (System.in);
		
		System.out.print("Insira um N�mero: ");
		double num = s.nextDouble();
		
		if (num > Math.floor(num) ) {   // S� vai ler se for com virgula
			System.out.print("� um N�mero Decimal"); 
		}else {
			System.out.print("� um N�moro Inteiro");
		}
		
		
		
	}

}
