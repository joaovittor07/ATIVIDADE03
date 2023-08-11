package ATIVIDADE03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// Faça um Programa que peça dois números e imprima o maior deles.

		Scanner s = new Scanner (System.in);
		
		System.out.print("Informe O 1º Número: ");
		int n1 = s.nextInt();
		
		System.out.print("Informe O 2º Número: ");
		int n2 = s.nextInt();
		
		if (n1 > n2) {
			
			System.out.print("\nO 1º Numero é Maior");
			
		}else if (n2 > n1) {
			
			System.out.print("\nO 2º Numero é Maior");
			
		}else {
			
			System.out.print("\nNão pode ser Igual");
			
		}
		
		s.close();
	}

}
