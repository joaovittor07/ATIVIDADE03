package LISTA.DE.EXERCICIO2;

import java.util.Scanner;

public class Ex28_Tres_Varia��es {

	public static void main(String[] args) {
		
		/* Fa�a um Programa que leia 2 n�meros e em seguida pergunte ao 
		   usu�rio qual opera��o ele deseja realizar. O resultado da opera��o 
		   deve ser acompanhado de uma frase que diga se o n�mero �:
			 � par ou �mpar;
		   	 � positivo ou negativo;
		     � inteiro ou decimal. */
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Insira o 1� N�mero: ");
			int num1 = s.nextInt();
		
		System.out.print("Insira o 2� N�mero: ");
			int num2 = s.nextInt();
		
		System.out.println("\nDigete A = Adi��o"
				        + "\nDigete M = Multiplica��o"
				        + "\nDigete D = Divi��o"
				        + "\nDigete S = Subtra��o");
			String letra = s.next();
		
		if(letra.equalsIgnoreCase("A")) {
			int total1 = (num1 + num2);
			System.out.print("\nO resultado �: " + total1);
			if (total1 % 2 == 0) {
				System.out.print("\nEsse N�mero � Par");
			}else {
				System.out.print("\nEsse N�mero � Impar");
			}

			if(total1 > 0) {
				System.out.print("\nO valor � Positivo");
			}else if(total1 < 0) {
				System.out.print("\nO valor � Negativo");
		    }
			
			if (total1 > Math.floor(total1) ) { 
				System.out.print("\n� um N�mero Decimal"); 
			}else {
				System.out.print("\n� um N�moro Inteiro");
			}
			
		}else if(letra.equalsIgnoreCase("M")) {
			int total2 = (num1 * num2);
			System.out.print("\nO resultado �: " + total2);
			if (total2 % 2 == 0) {
				System.out.print("\nEsse N�mero � Par");
			}else {
				System.out.print("\nEsse N�mero � Impar");
			}
			
			if(total2 > 0) {
				System.out.print("\nO valor � Positivo");
			}else if(total2 < 0) {
				System.out.print("\nO valor � Negativo");
		    }
			
			if (total2 > Math.floor(total2) ) { 
				System.out.print("\n� um N�mero Decimal"); 
			}else {
				System.out.print("\n� um N�moro Inteiro");
			}
			
		}else if(letra.equalsIgnoreCase("D")) {
			int total3 = (num1 / num2);
			System.out.print("\nO resultado �: " + total3);
			if (total3 % 2 == 0) {
				System.out.print("\nEsse N�mero � Par");
			}else {
				System.out.print("\nEsse N�mero � Impar");
			}
			
			if(total3 > 0) {
				System.out.print("\nO valor � Positivo");
			}else if(total3 < 0) {
				System.out.print("\n\nO valor � Negativo");
		    }
			
			if (total3 > Math.floor(total3) ) { 
				System.out.print("\n� um N�mero Decimal"); 
			}else {
				System.out.print("\n� um N�moro Inteiro");
			}
			
		}else if(letra.equalsIgnoreCase("S")) {
			int total4 = (num1 - num2);
			System.out.print("\nO resultado �: " + total4);
			if (total4 % 2 == 0) {
				System.out.print("\nEsse N�mero � Par");
			}else {
				System.out.print("\nEsse N�mero � Impar");
			}
			
			if(total4 > 0) {
				System.out.print("\nO valor � Positivo");
			}else if(total4 < 0) {
				System.out.print("\nO valor � Negativo");
		    }
			
			if (total4 > Math.floor(total4) ) { 
				System.out.print("\n� um N�mero Decimal"); 
			}else {
				System.out.print("\n� um N�moro Inteiro");
			}
			
		}
		
	}

}
