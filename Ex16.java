package ATIVIDADE03;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		/* Altere o programa que calcula a média do aluno, e mostre a mensagem de acordo  
           com a média. De 0 a 3 - Reprovado, de 3 a 6.9 - Em Exame, de 7 a 10 - Aprovado. */
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Insira a 1º Nota: ");
		
			int nota1 = s.nextInt();
		
		System.out.print("\nInsira a 2º Nota: ");
		
			int nota2 = s.nextInt();
		
		System.out.print("\nInsira a 3º Nota: ");
		
			int nota3 = s.nextInt();
		
		System.out.print("\nInsira a 4º Nota: ");
		
			int nota4 = s.nextInt();
			
		int total = ((nota1 + nota2 + nota3 + nota4) / 4);
		
		String res = null;
		
		if(total < 3) {
			
			res = "Reprovado";
			
		}else if(total < 6.9) {
			
			res = "Em Exame";
			
		}else if(total >= 7) {
			
			res = "Em Exame";
			
		}
		
		System.out.print("\nA Nota Final é: " + total);
		System.out.print("Seu Resultado é: " + res);

		s.close();
	}

}
