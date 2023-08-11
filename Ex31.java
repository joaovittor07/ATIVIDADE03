package LISTA.DE.EXERCICIO2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		/*Uma fruteira está vendendo frutas com a seguinte tabela de preços:
		             
		               Até 5 Kg           Acima de 5 Kg
		  Morango:     R$ 2,50 por Kg     R$ 2,20 por Kg
	      Maçã:        R$ 1,80 por Kg     R$ 1,50 por Kg
		  
		  Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra
		  ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total.
		  Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a
		  quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo
		  cliente.*/

		Scanner s = new Scanner (System.in);
		
		DecimalFormat deci = new DecimalFormat("0.0");
		
		System.out.print("Digite 1 - (Morango) ou 2 - (Maçã): ");
		
			String numero = s.nextLine();
		
		System.out.print("\nInforme quantos kilos vai levar: ");
		
			int kilo = s.nextInt();
		
		if (numero.equalsIgnoreCase("1")) {
			
			if (kilo <= 5) {
				
				double valor = (kilo * 2.5);
				
				System.out.print("\nO valor a ser pago é: " + deci.format(valor));
				
				if(valor >= 25) {
					
					double V1 = (kilo * 2.2);
					double V2 = ((V1 * 10) / 100);
					double V3 = V1 - V2;
					
					System.out.println("\nSeu desconto de 10% é: " + deci.format(V3));
					
				}
				
				
			}else if(kilo > 5)  {
				
				double valor = (kilo * 2.2);
				
				System.out.println("\nO valor a ser pago é: " + deci.format(valor));
				
				if(valor >= 25) {
					
					double V1 = (kilo * 2.2);
					double V2 = ((V1 * 10) / 100);
					double V3 = V1 - V2;
					
					System.out.println("\nSeu desconto de 10% é: " + deci.format(V3));
					
				}
				
			}else if(kilo >= 8) {
				
				double V1 = (kilo * 2.2);
				double V2 = ((V1 * 10) / 100);
				double V3 = V1 - V2;
				
				System.out.println("\nO valor a ser pago é: " + deci.format(V3));
				
				if(V3 >= 25) {
					
					double V11 = (kilo * 2.2);
					double V12 = ((V11 * 10) / 100);
					double V13 = V11 - V12;
					
					System.out.println("\nSeu desconto de 10% é: " + deci.format(V13));
					
				}
				
			}
			
		}else if(numero.equalsIgnoreCase("2")) {
			
			if (kilo <= 5) {
				
				double valor = (kilo * 1.8);
				
				System.out.println("\nO valor a ser pago é: " + deci.format(valor));
				
                if(valor >= 25) {
					
					double V1 = (kilo * 1.8);
					double V2 = ((V1 * 10) / 100);
					double V3 = V1 - V2;
					
					System.out.println("\nSeu desconto de 10% é: " + deci.format(V3));
					
				}
				
			}else if(kilo > 5) {
				
				double valor = (kilo * 1.5);
				
				System.out.println("\nO valor a ser pago é: " + deci.format(valor));
				
				if(valor >= 25) {
					
					double V1 = (kilo * 1.5);
					double V2 = ((V1 * 10) / 100);
					double V3 = V1 - V2;
					
					System.out.println("\nSeu desconto de 10% é: " + deci.format(V3));
					
				}
				
			}else if(kilo >= 8) {
				
				double V1 = (kilo * 2.2);
				double V2 = ((V1 * 10) / 100);
				double V3 = V1 - V2;
				
				System.out.println("\nO valor a ser pago é: " + deci.format(V3));
				
				if(V3 >= 25) {
					
					double V11 = (kilo * 1.5);
					double V12 = ((V11 * 10) / 100);
					double V13 = V11 - V12;
					
					System.out.println("\nSeu desconto de 10% é: " + deci.format(V13));
					
				}
				
			}
			
		}
		
	}

}
