package ATIVIDADE03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		/* Faça um Programa que pergunte em que turno você estuda. Peça
		   para digitar M-Matutino ou V-Vespertino ou N- Noturno. Imprima
		   a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!, conforme o caso. */
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Digite M, N ou V: ");
		
		char letra = s.next().charAt(0);
		
		if((letra == 'M') || (letra == 'm')) {
			
			System.out.print("\nBom Dia!");
			
		}else if((letra == 'N') || (letra == 'n')) {
			
			System.out.print("\nBoa Tarde!");
			
		}else if((letra == 'V') || (letra == 'v')) {
			
			System.out.print("\nBoa Noite!");
			
		}
		
		s.close();
	}

}
