package LISTA.DE.EXERCICIO2;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		/* Um posto está vendendo combustíveis com a seguinte tabela de 
		   descontos: 
		   - Álcool:até 20 litros, desconto de 3% por litro acima de 20 litros, 
				   desconto de 5% por litro
		   - Gasolina:até 20 litros, desconto de 4% por litro acima de 20 litros, 
			       desconto de 6% por litro
			Escreva um algoritmo que leia o número de litros vendidos, o tipo de 
			combustível (codificado da seguinte forma: A-álcool, G-gasolina),
		    calcule e imprima o valor a ser pago pelo cliente sabendo-se que 
		    o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool 
		    é R$ 1,90. */
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Vai querer G - (Gasolina) ou A - (Álcool) ?: ");
		
		String letra = s.nextLine();
		
		System.out.print("\nInforme a Quantidade de Litros: ");
			int litro = s.nextInt();
		
		if (letra.equalsIgnoreCase("G")) {
			
			if(litro <= 20) {
			
			double G1 = (litro * 2.5);
			double G2 = ((G1 * 4) / 100);
			double G3 = G1 - G2;

			System.out.println("\nO valor de " + litro + " litro vezes 2.5 é: " + G1);
			System.out.println("\nO valor do Desconto é: " + G2);
			System.out.println("\nO valor Total a ser pago é de: " + G3);

			}else if(litro > 20) {
				
			double G1 = (litro * 2.5);
			double G2 = ((G1 * 6) / 100);
			double G3 = G1 - G2;

			System.out.println("\nO valor de " + litro + " litros vezes 2.5 é: " + G1);
			System.out.println("\nO valor do Desconto é: " + G2);
			System.out.println("\nO valor Total a ser pago é de: " + G3);
			
			}	
		
		}else if(letra.equalsIgnoreCase("A")) {
		
			if(litro <= 20) {
			
			double A1 = (litro * 1.9);
			double A2 = ((A1 * 3) / 100);
			double A3 = A1 - A2;

			System.out.println("\nO valor de " + litro + " litro vezes 1.9 é: " + A1);
			System.out.println("\nO valor do Desconto é: " + A2);
			System.out.println("\nO valor Total a ser pago é de: " + A3);
			
			}else if(litro > 20) {
			
			double A1 = (litro * 1.9);
			double A2 = ((A1 * 5) / 100);
			double A3 = A1 - A2;

			System.out.println("\nO valor de " + litro + "litro vezes 1.9 é: " + A1);
			System.out.println("\nO valor do Desconto é: " + A2);
			System.out.println("\nO valor Total a ser pago é de: " + A3);
			
			}	
		}
			
	}
		
}


