package ATIVIDADE03;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		/* Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade
		   de centenas, dezenas e unidades do mesmo.
		   
		   Exemplo:
		   326 = 3 centenas, 2 dezenas e 6 unidades
		   12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320, 310,305, 301, 101, 
		   311, 111, 25, 20, 10, 21, 11, 1, 7 e 16 */

		Scanner s = new Scanner (System.in);
		
		System.out.print("Digite um Valor: ");
		int num = s.nextInt();
		
		if (num < 1000) {
			
			System.out.print("Tem que ser Menor que 1000");
			
		}
		
		int cen = (num / 100);
		int dez = (num % 100) / 10;
		int uni = (num % 10);
		
		System.out.print("\nCentena: " + cen);
		System.out.print("\nDezena: " + dez);
		System.out.print("\nUnidade: " + uni);
		
		s.close();
	}

}
