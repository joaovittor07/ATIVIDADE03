package LISTA.DE.EXERCICIO2;

import java.util.Scanner;

public class Ex28_Tres_Variações {

	public static void main(String[] args) {
		
		/* Faça um Programa que leia 2 números e em seguida pergunte ao 
		   usuário qual operação ele deseja realizar. O resultado da operação 
		   deve ser acompanhado de uma frase que diga se o número é:
			 º par ou ímpar;
		   	 º positivo ou negativo;
		     º inteiro ou decimal. */
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Insira o 1º Número: ");
			int num1 = s.nextInt();
		
		System.out.print("Insira o 2º Número: ");
			int num2 = s.nextInt();
		
		System.out.println("\nDigete A = Adição"
				        + "\nDigete M = Multiplicação"
				        + "\nDigete D = Divição"
				        + "\nDigete S = Subtração");
			String letra = s.next();
		
		if(letra.equalsIgnoreCase("A")) {
			int total1 = (num1 + num2);
			System.out.print("\nO resultado é: " + total1);
			if (total1 % 2 == 0) {
				System.out.print("\nEsse Número é Par");
			}else {
				System.out.print("\nEsse Número é Impar");
			}

			if(total1 > 0) {
				System.out.print("\nO valor é Positivo");
			}else if(total1 < 0) {
				System.out.print("\nO valor é Negativo");
		    }
			
			if (total1 > Math.floor(total1) ) { 
				System.out.print("\nÉ um Número Decimal"); 
			}else {
				System.out.print("\nÉ um Númoro Inteiro");
			}
			
		}else if(letra.equalsIgnoreCase("M")) {
			int total2 = (num1 * num2);
			System.out.print("\nO resultado é: " + total2);
			if (total2 % 2 == 0) {
				System.out.print("\nEsse Número é Par");
			}else {
				System.out.print("\nEsse Número é Impar");
			}
			
			if(total2 > 0) {
				System.out.print("\nO valor é Positivo");
			}else if(total2 < 0) {
				System.out.print("\nO valor é Negativo");
		    }
			
			if (total2 > Math.floor(total2) ) { 
				System.out.print("\nÉ um Número Decimal"); 
			}else {
				System.out.print("\nÉ um Númoro Inteiro");
			}
			
		}else if(letra.equalsIgnoreCase("D")) {
			int total3 = (num1 / num2);
			System.out.print("\nO resultado é: " + total3);
			if (total3 % 2 == 0) {
				System.out.print("\nEsse Número é Par");
			}else {
				System.out.print("\nEsse Número é Impar");
			}
			
			if(total3 > 0) {
				System.out.print("\nO valor é Positivo");
			}else if(total3 < 0) {
				System.out.print("\n\nO valor é Negativo");
		    }
			
			if (total3 > Math.floor(total3) ) { 
				System.out.print("\nÉ um Número Decimal"); 
			}else {
				System.out.print("\nÉ um Númoro Inteiro");
			}
			
		}else if(letra.equalsIgnoreCase("S")) {
			int total4 = (num1 - num2);
			System.out.print("\nO resultado é: " + total4);
			if (total4 % 2 == 0) {
				System.out.print("\nEsse Número é Par");
			}else {
				System.out.print("\nEsse Número é Impar");
			}
			
			if(total4 > 0) {
				System.out.print("\nO valor é Positivo");
			}else if(total4 < 0) {
				System.out.print("\nO valor é Negativo");
		    }
			
			if (total4 > Math.floor(total4) ) { 
				System.out.print("\nÉ um Número Decimal"); 
			}else {
				System.out.print("\nÉ um Númoro Inteiro");
			}
			
		}
		
	}

}
