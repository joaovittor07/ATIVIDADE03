package ATIVIDADE03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		/* Faça um Programa que peça para entrar com um ano com 4 dígitos 
		   e determine se o mesmo é ou não bissexto. */
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Digite um Ano: ");
		int ano = s.nextInt();
		
		double res = ano % 4;
		
		if (res == 0) {
			
			System.out.print("\nEsse Ano é Bissexto");
			
		}else {
			
			System.out.print("\nEsse Ano não é Bissexto");
			
		}
		
		s.close();
	}

}
