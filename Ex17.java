package ATIVIDADE03;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		/* Faça um programa que lê as duas notas parciais obtidas por um aluno numa 
		   disciplina ao longo de um semestre, e calcule a sua média. A atribuição de 
		   conceitos obedece à tabela abaixo:
		   Média de Aproveitamento Conceito
		   - Entre 9.0 e 10.0 A
		   - Entre 7.5 e 9.0  B
		   - Entre 6.0 e 7.5  C
		   - Entre 4.0 e 6.0  D
		   - Entre 4.0 e zero E 
		   O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente 
           e a mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o conceito
           for D ou E.*/
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Informe a 1º Nota: ");
		float nota1 = s.nextInt();
		
		System.out.print("Informe a 2º Nota: ");
		float nota2 = s.nextInt();
		
		float media = ((nota1 + nota2) / 2);
		
		String res = null;
		
		String ava = null;
		
		if((media >= 9) && (media <= 10)) {
			
			ava = "A";
			res = "APROVADO";
			
		}else if((media >= 7.5) && (media <= 9)) {
		
			ava = "B";
			res = "APROVADO";
			
	    }else if((media >= 6) && (media <= 7.5)) {
		
	    	ava = "C";
	    	res = "APROVADO";
			
	    }else if((media >= 4) && (media <= 6)) {
		
			ava = "D";
			res = "REPROVADO";
			
	    }else {
		
	    	ava = "E";
	    	res = "REPROVADO";
			
	    }
		
		System.out.print("\nSua 1º Nota é: " + nota1);
		System.out.print("\nSua 2º Nota é: " + nota2);
		System.out.print("\nSua Média é: " + media);
		System.out.print("\nSeu Avaliação é: " + ava);
		System.out.print("\nSeu Resultado é: " + res);
		
		s.close();
	}

}
