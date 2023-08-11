package LISTA.DE.EXERCICIO2;

import java.util.Scanner;

public class Ex24_Média_de_Três_Notas_Aprovado_Reprovado_ou_Disitinção {

	public static void main(String[] args) {
		
		/* Faça um Programa para leitura de três notas parciais de um aluno. 
		   O programa deve calcular a média alcançada por aluno e presentar:
		     ◦ A mensagem "Aprovado", se a média for maior ou igual a 7, com 
		       a respectiva média alcançada;
             ◦ A mensagem "Reprovado", se a média for menor do que 7, com a 
               respectiva média alcançada;
             ◦ A mensagem "Aprovado com Distinção", se a média for igual a 10. */

		Scanner s = new Scanner (System.in);
		
		System.out.print("Insira a 1º Nota: ");
			int nota1 = s.nextInt();
			
		System.out.print("Insira a 2º Nota: ");
			int nota2 = s.nextInt();
			
		System.out.print("Insira a 3º Nota: ");
			int nota3 = s.nextInt();
		
		int media = ((nota1 + nota2 + nota3) / 3);
		
		if(media >= 7 && media <= 9) {

			System.out.print("\nAprovado");
			
		}else if(media < 7) {
			
			System.out.print("\nReprovado");
			
		}else if(media == 10) {
			
			System.out.print("\nAprovado com Distinção");
		}
		
	}

}
