package LISTA.DE.EXERCICIO2;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		/* Fa�a um Programa para um caixa eletr�nico. O programa dever� 
		   perguntar ao usu�rio a valor do saque e depois informar 
		   quantas notas de cada valor ser�o fornecidas. As notas dispon�veis 
		   ser�o as de 1, 5, 10, 50 e 100 reais. O valor m�nimo � de 10 reais 
		   e o m�ximo de 600 reais. O programa n�o deve se preocupar com a 
		   quantidade de notas existentes na m�quina.
		     �Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece 
		      duas notas de 100, uma nota de 50, uma nota de 5 e uma nota de 1;
		     �Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece 
		      tr�s notas de 100, uma nota de 50, quatro notas de 10, uma nota de 
		      5 e quatro notas de 1 */
		
		Scanner s = new Scanner (System.in);
		
		int nota1 = 0;
		int nota5 = 0;
		int nota10 = 0;
		int nota50 = 0;
		int nota100 = 0;
		
		System.out.print("Insira um Valor de 10 a 600: ");
			int valor = s.nextInt();
			
		if(valor < 10) {
			
			System.out.print("Valor Abaixo do Necessario\n");
			
		}else if(valor > 600){
			
			System.out.print("Valor Al�m do Necessaro\n");
			
		}
		
		nota100 = valor / 100;
		valor %= 100;
		
		nota50 = valor / 50;
		valor %= 50;
		
		nota10 = valor / 10;
		valor %= 10;
		
		nota5 = valor / 5;
		valor %= 5;
		
		nota1 = valor;
		
        System.out.println(nota100 + " nota(s) de 100");
        System.out.println(nota50 + " nota(s) de 50");
        System.out.println(nota10 + " nota(s) de 10");
        System.out.println(nota5 + " nota(s) de 5");
        System.out.println(nota1 + " nota(s) de 1");
		
	}
}
