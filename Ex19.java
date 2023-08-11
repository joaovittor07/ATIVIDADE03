package ATIVIDADE03;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		/* Faça um programa que calcule as raízes de uma equação do segundo grau, 
		   na forma ax2 + bx + c. O programa deverá pe seguintes situações: 
		   - Se o usuário informar o valor de A igual a zero, a equação não é do 
           segundo grau e o programa não deve fazer pedir os demais valores, sendo 
           encerrado;
           - Se o delta calculado for negativo, a equação não possui raizes reais. 
           Informe ao usuário e encerre o programa;
           - Se o delta calculado for igual a zero a equação possui apenas uma raiz 
           real; informe-a ao usuário;
           - Se o delta for positivo, a equação possui duas raiz reais; informe-as 
		   ao usuário; */
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Informe o Valor de A: ");
		int a = s.nextInt();
		
		if(a == 0) {
			
			System.out.println("\nComo A é 0, não é uma Equação do 2º Grau");
			
			System.exit(0);
			
		}
		
		System.out.print("Informe o Valor de B: ");
		int b = s.nextInt();
		
		System.out.print("Informe o Valor de C: ");
		int c = s.nextInt();
		
		int del = ((b * b) - (4 * a * c));
		
		int raiz = (int) Math.sqrt(del);
		
		int x1 = ((-b + raiz) / (2 * a));
		
		int x2 = ((-b - raiz) / (2 * a));
		
		if (del < 0) {
			
			System.out.println("\nComo o Delta é Negativo, não Possui raiz");
			
		}else if (del == 0) {
			
			System.out.println("\nComo Delta é 0, a Equação possui apenaz uma Raiz Real");
			
		}else {
			
			System.out.println("\nA Equação possui duas Raiz Real");
			System.out.println("\nO Valor de A é: " + a);
			System.out.println("\nO Valor de B é: " + b);
			System.out.println("\nO Valor de A é: " + c);
			System.out.println("\nO Valor de Delata é: " + del);
			System.out.println("\nO Valor da Raiz é " + raiz);
			System.out.println("\nO Valor de X1 é: " + x1);
			System.out.println("\nO Valor de X2 é: " + x2);
			
		}
		
		s.close();
	}

}
