package ATIVIDADE03;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		/* Fa�a um Programa que leia um n�mero e exiba o dia correspondente da semana.
		   (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inv�lido. */
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Digite um N�mero entre 1 a 7: ");
		int num = s.nextInt();
		
		if(num == 1) {
			
			System.out.print("\nDomingo");
			
		}else if(num == 2) {
			
			System.out.print("\nS�bado");
			
		}else if(num == 3) {
			
			System.out.print("\nSegunda");
			
		}else if(num == 4) {
			
			System.out.print("\nTer�a");
			
		}else if(num == 5) {
			
			System.out.print("\nQuarta");
			
		}else if(num == 6) {
			
			System.out.print("\nQuinta");
			
		}else if(num == 7) {
			
			System.out.print("\nSexta");
			
		}else {
			
			System.out.print("\nValor Inv�lido");
			
		}
		
		s.close();
	}

}
