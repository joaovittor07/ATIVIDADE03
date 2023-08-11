package LISTA.DE.EXERCICIO2;

import java.util.Scanner;

public class Ex23_Media_de_Idade {

	public static void main(String[] args) {
		
		/* Faça um Programa para ler três idades de alunos e seguir as 
		   seguintes instruções:
		      ◦ Se a média de idade dos alunos é inferior de 25, apresentar 
		        a mensagem "Turma Jovem";
              ◦ Se a média de idade dos alunos é entre 25 e 40, apresentar 
                a mensagem "Turma Adulta";
              ◦ Se a média de idade dos alunos é acima de 40 anos, apresentar 
                a mensagem "Turma Idosa". */
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Insira a 1º Idade: ");
			int num1 = s.nextInt();
		
		System.out.print("Insira a 2º Idade: ");
			int num2 = s.nextInt();
		
		System.out.print("Insira a 3º Idade: ");
			int num3 = s.nextInt();
			
		int num = ((num1 + num2 + num3) / 3);
		
		if (num <= 25) {
			
			System.out.print("\nTurma Jovem");
			
		}else if (num > 25 && num <= 40) {
			
			System.out.print("\nTurma Adulta");
			
		}else if(num > 40) {
			
			System.out.print("\nTurma Idosa");
		}

	}

}
