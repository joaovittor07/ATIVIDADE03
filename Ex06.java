package ATIVIDADE03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		/* Faça um Programa que peça um número inteiro e se este número for par,
		   transforme-o em impar e vice-versa. */
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Digite um Número Par ou Impar: ");
		
		int num = s.nextInt();
		
		if((num % 2) == 0) {
			
			System.out.print("\nEsse Número é Par");
			
			int par = (num + 1);
			
			System.out.print("\nAgora sera: " + par);
			
		}else if((num % 1) == 0) {
			
			System.out.print("\nEsse Número é Impar");
			
			int imp = (num + 1);
			
			System.out.print("\nAgora será: " + imp);
			
		}
		
		s.close();		
	}

}
