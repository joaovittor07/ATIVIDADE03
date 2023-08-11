package ATIVIDADE03;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		/* Faça um Programa que peça uma data no formato dd/mm/aaaa 
		   e determine se a mesma é uma data válida. */
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Informe o Dia: ");
		int dia = s.nextInt();
		
		if ((dia > 0) && (dia <= 31)) {
			
			System.out.print("O Dia não conhecide com o Calendario");
			
			System.exit(0);
			
		}
		
		System.out.print("Informe o Mês: ");
		int mes = s.nextInt();
		
		if((mes > 0) && (mes <= 12)) {
			
			System.out.print("O Mês não conhecide com o Calendario");
			
			System.exit(0);
		
		}
		
		System.out.print("Informe o Ano: ");
		int ano = s.nextInt();
		
		String digito = String.format("%04d", ano);
		
		String data = (dia + "/" + mes + "/" + digito);
			
		System.out.print(data);

		s.close();
	}

		
}

