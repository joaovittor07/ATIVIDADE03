package LISTA.DE.EXERCICIO2;

import java.util.Scanner;

public class Ex26_Par_ou_Impar {

	public static void main(String[] args) {
		/* Fa�a um Programa que pe�a um n�mero inteiro e determine se ele � 
		   par ou impar. Dica: utilize o operador m�dulo (resto da divis�o) */
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Insira um Numero: ");
			int num = s.nextInt();
			
	    if (num % 2 == 0) {
			System.out.print("\nEsse N�mero � Par");
		}else {
			System.out.print("\nEsse N�mero � Impar");
		}
		
	}

}
