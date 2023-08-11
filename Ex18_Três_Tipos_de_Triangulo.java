package LISTA.DE.EXERCICIO2;

import java.util.Scanner;

public class Ex18_Tr�s_Tipos_de_Triangulo {

	public static void main(String[] args) {
		
		/*Fa�a um Programa que pe�a os 3 lados de um tri�ngulo. O programa dever� 
		  informar se os valores podem ser um tri�ngulo. Indique, caso os lados 
		  formem um tri�ngulo, se o mesmo �: equil�tero, is�sceles ou escaleno.
			Dicas:
			Tr�s lados formam um tri�ngulo quando a soma de quaisquer dois lados 
			for maior que o terceiro;
			- Tri�ngulo Equil�tero: tr�s lados iguais;
			- Tri�ngulo Is�sceles: quaisquer dois lados iguais;
			- Tri�ngulo Escaleno: tr�s lados diferentes */

		Scanner s = new Scanner (System.in);
		
		System.out.print("Insira o 1� Lado: ");
		
			int lado1 = s.nextInt();
			System.out.println();		
		
		System.out.print("Insira o 2� Lado: ");
			
			int lado2 = s.nextInt();
			System.out.println();	
			
		System.out.print("Insira o 3� Lado: ");
			
			int lado3 = s.nextInt();
			System.out.println();		
		
		if(lado1 == lado2 && lado1 == lado3) {
			System.out.print("� um Tri�ngulo Equil�tero");
		}else if(lado1 == lado2 && lado1 != lado3 || lado2 == lado3) {
			System.out.print("� um Tri�ngulo Is�sceles");
		}else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
			System.out.print("� um Tri�ngulo Escaleno");
		}
	}
}
