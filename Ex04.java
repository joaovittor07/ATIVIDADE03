package ATIVIDADE03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		/* Fa�a um Programa que pe�a para entrar com um ano com 4 d�gitos 
		   e determine se o mesmo � ou n�o bissexto. */
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Digite um Ano: ");
		int ano = s.nextInt();
		
		double res = ano % 4;
		
		if (res == 0) {
			
			System.out.print("\nEsse Ano � Bissexto");
			
		}else {
			
			System.out.print("\nEsse Ano n�o � Bissexto");
			
		}
		
		s.close();
	}

}
