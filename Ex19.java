package ATIVIDADE03;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		/* Fa�a um programa que calcule as ra�zes de uma equa��o do segundo grau, 
		   na forma ax2 + bx + c. O programa dever� pe seguintes situa��es: 
		   - Se o usu�rio informar o valor de A igual a zero, a equa��o n�o � do 
           segundo grau e o programa n�o deve fazer pedir os demais valores, sendo 
           encerrado;
           - Se o delta calculado for negativo, a equa��o n�o possui raizes reais. 
           Informe ao usu�rio e encerre o programa;
           - Se o delta calculado for igual a zero a equa��o possui apenas uma raiz 
           real; informe-a ao usu�rio;
           - Se o delta for positivo, a equa��o possui duas raiz reais; informe-as 
		   ao usu�rio; */
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Informe o Valor de A: ");
		int a = s.nextInt();
		
		if(a == 0) {
			
			System.out.println("\nComo A � 0, n�o � uma Equa��o do 2� Grau");
			
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
			
			System.out.println("\nComo o Delta � Negativo, n�o Possui raiz");
			
		}else if (del == 0) {
			
			System.out.println("\nComo Delta � 0, a Equa��o possui apenaz uma Raiz Real");
			
		}else {
			
			System.out.println("\nA Equa��o possui duas Raiz Real");
			System.out.println("\nO Valor de A �: " + a);
			System.out.println("\nO Valor de B �: " + b);
			System.out.println("\nO Valor de A �: " + c);
			System.out.println("\nO Valor de Delata �: " + del);
			System.out.println("\nO Valor da Raiz � " + raiz);
			System.out.println("\nO Valor de X1 �: " + x1);
			System.out.println("\nO Valor de X2 �: " + x2);
			
		}
		
		s.close();
	}

}
