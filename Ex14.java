package ATIVIDADE03;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		/* Faça um Programa que leia um número e exiba o dia correspondente da semana.
		   (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido. */
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Digite um Número entre 1 a 7: ");
		int num = s.nextInt();
		
		if(num == 1) {
			
			System.out.print("\nDomingo");
			
		}else if(num == 2) {
			
			System.out.print("\nSábado");
			
		}else if(num == 3) {
			
			System.out.print("\nSegunda");
			
		}else if(num == 4) {
			
			System.out.print("\nTerça");
			
		}else if(num == 5) {
			
			System.out.print("\nQuarta");
			
		}else if(num == 6) {
			
			System.out.print("\nQuinta");
			
		}else if(num == 7) {
			
			System.out.print("\nSexta");
			
		}else {
			
			System.out.print("\nValor Inválido");
			
		}
		
		s.close();
	}

}
