package ATIVIDADE03;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		/* Fa�a um Programa que pe�a uma data no formato dd/mm/aaaa 
		   e determine se a mesma � uma data v�lida. */
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Informe o Dia: ");
		int dia = s.nextInt();
		
		if ((dia > 0) && (dia <= 31)) {
			
			System.out.print("O Dia n�o conhecide com o Calendario");
			
			System.exit(0);
			
		}
		
		System.out.print("Informe o M�s: ");
		int mes = s.nextInt();
		
		if((mes > 0) && (mes <= 12)) {
			
			System.out.print("O M�s n�o conhecide com o Calendario");
			
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

