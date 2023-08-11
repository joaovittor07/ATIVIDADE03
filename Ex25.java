package LISTA.DE.EXERCICIO2;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		/* Faça um Programa para um caixa eletrônico. O programa deverá 
		   perguntar ao usuário a valor do saque e depois informar 
		   quantas notas de cada valor serão fornecidas. As notas disponíveis 
		   serão as de 1, 5, 10, 50 e 100 reais. O valor mínimo é de 10 reais 
		   e o máximo de 600 reais. O programa não deve se preocupar com a 
		   quantidade de notas existentes na máquina.
		     ºExemplo 1: Para sacar a quantia de 256 reais, o programa fornece 
		      duas notas de 100, uma nota de 50, uma nota de 5 e uma nota de 1;
		     ºExemplo 2: Para sacar a quantia de 399 reais, o programa fornece 
		      três notas de 100, uma nota de 50, quatro notas de 10, uma nota de 
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
			
			System.out.print("Valor Além do Necessaro\n");
			
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
