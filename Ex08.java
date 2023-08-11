package ATIVIDADE03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		/* Faça um programa para a leitura de duas notas parciais de um aluno. 
		   O programa deve calcular a média alcançada pelo aluno e apresentar:
		     - A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
			 - A mensagem "Reprovado", se a média for menor do que sete; */
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Informe a 1º Nota: ");
		int n1 = s.nextInt();
		
		System.out.print("Informe a 2º Nota: ");
		int n2 = s.nextInt();
		
		int media = (n1 + n2) / 2;
		
		if(media >= 7) {
			
			System.out.print("\nSua Nota é: " + media);
			System.out.print("\nAprovado");
			
		}else if (media < 7) {
			
			System.out.print("\nSua Nota é: " + media);
			System.out.print("\nReprovado");
			
		}
		
		s.close();
	}

}
