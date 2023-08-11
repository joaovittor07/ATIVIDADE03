package LISTA.DE.EXERCICIO2;

import java.util.Scanner;

public class Ex26_Par_ou_Impar {

	public static void main(String[] args) {
		/* Faça um Programa que peça um número inteiro e determine se ele é 
		   par ou impar. Dica: utilize o operador módulo (resto da divisão) */
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Insira um Numero: ");
			int num = s.nextInt();
			
	    if (num % 2 == 0) {
			System.out.print("\nEsse Número é Par");
		}else {
			System.out.print("\nEsse Número é Impar");
		}
		
	}

}
