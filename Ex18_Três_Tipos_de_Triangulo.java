package LISTA.DE.EXERCICIO2;

import java.util.Scanner;

public class Ex18_Três_Tipos_de_Triangulo {

	public static void main(String[] args) {
		
		/*Faça um Programa que peça os 3 lados de um triângulo. O programa deverá 
		  informar se os valores podem ser um triângulo. Indique, caso os lados 
		  formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
			Dicas:
			Três lados formam um triângulo quando a soma de quaisquer dois lados 
			for maior que o terceiro;
			- Triângulo Equilátero: três lados iguais;
			- Triângulo Isósceles: quaisquer dois lados iguais;
			- Triângulo Escaleno: três lados diferentes */

		Scanner s = new Scanner (System.in);
		
		System.out.print("Insira o 1º Lado: ");
		
			int lado1 = s.nextInt();
			System.out.println();		
		
		System.out.print("Insira o 2º Lado: ");
			
			int lado2 = s.nextInt();
			System.out.println();	
			
		System.out.print("Insira o 3º Lado: ");
			
			int lado3 = s.nextInt();
			System.out.println();		
		
		if(lado1 == lado2 && lado1 == lado3) {
			System.out.print("É um Triângulo Equilátero");
		}else if(lado1 == lado2 && lado1 != lado3 || lado2 == lado3) {
			System.out.print("É um Triângulo Isósceles");
		}else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
			System.out.print("É um Triângulo Escaleno");
		}
	}
}
