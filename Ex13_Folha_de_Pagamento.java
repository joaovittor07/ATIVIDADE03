package LISTA.DE.EXERCICIO2;

import java.util.Scanner;

public class Ex13_Folha_de_Pagamento {

	public static void main(String[] args) {
		
		/*Fa�a um programa para o c�lculo de uma folha de pagamento, sabendo que os
	      descontos s�o do Imposto de Renda, que depende do sal�rio bruto (conforme 
	      tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do 
	      Sal�rio Bruto, mas n�o � descontado (� a empresa que deposita). O Sal�rio 
	      L�quido corresponde ao Sal�rio Bruto menos os descontos. O programa dever� 
	      pedir ao usu�rio o valor da sua hora e a quantidade de horas trabalhadas no 
	      m�s. Desconto do IR:
			- Sal�rio Bruto at� 900 (inclusive) - isento
			- Sal�rio Bruto at� 1500 (inclusive) - desconto de 5%
			- Sal�rio Bruto at� 2500 (inclusive) - desconto de 10%
			- Sal�rio Bruto acima de 2500 - desconto de 20% Imprima na tela as informa��es, 
			  dispostas conforme o exemplo abaixo. No exemplo o valor da hora � 5 e a 
			  quantidade de hora � 220.
			- Sal�rio Bruto: (5 * 220)     : R$ 1100,00
				(-) IR (5%)                : R$ 55,00
				(-) INSS (10%)             : R$ 110,00
				(-) Sindicato              : R$ 33,00
				FGTS (11%)                 : R$ 121,00
				Total de descontos         : R$ 165,00
				Sal�rio Liquido            : R$ 935,00*/

        Scanner s = new Scanner (System.in);
		
        System.out.print("Informe o Valor por Hora Trabalhada: ");
        
        	int valor = s.nextInt();
        	System.out.println();
        
		System.out.print("Informe a Quantidade de Horas que voc� Trabalha: ");
	
			int hora = s.nextInt();
			
		int SB = (hora * valor); //Salario Bruto.
		int IR = 0;              //Imposto de Renda.
		int INSS = 0;            //Instituto Nacional do Seguro Social.
		int SIN = 0;             //Sindicato
		int FGTS = 0;            //Fundo de Garantia do Tempo de Servi�o.
		int DES = 0;             //Desconto
		int SL = 0;              //Sal�rio Liquido 
		
		if(SB <= 900.00) {
			IR = (SB * 0)/100;
			INSS = (SB * 10)/100;
			SIN = (SB * 3)/100;
			FGTS = (SB * 11)/100;
			DES = (INSS + IR);
			SL = (SB - DES);
			
		}else if(SB <= 1500.00)	{
			IR = (SB * 5)/100;
			INSS = (SB * 10)/100;
			SIN = (SB * 3)/100;
			FGTS = (SB * 11)/100;
			DES = (INSS + IR);
			SL = (SB - DES);
			
		}else if(SB <= 2500.00) {
			IR = (SB * 10)/100;
			INSS = (SB * 10)/100;
			SIN = (SB * 3)/100;
			FGTS = (SB * 11)/100;
			DES = (INSS + IR);
			SL = (SB - DES);

		}else if(SB > 2500.00) {
			IR = (SB * 20)/100;
			INSS = (SB * 10)/100;
			SIN = (SB * 3)/100;
			FGTS = (SB * 11)/100;
			DES = (INSS + IR);
			SL = (SB - DES);
	}
			System.out.print("\nSeu Sal�rio Bruto: R$ = " + SB);
			
			System.out.print("\nSeu IR �: R$ = " + IR);
			
			System.out.print("\nSeu INSS �: R$ = " + INSS);
			
			System.out.print("\nO valor do Sindicato �: R$ = " + SIN);
			
			System.out.print("\nSeu FGTS �: R$ = " + FGTS);
			
			System.out.print("\nTotal de Desconto �: R$ = " + DES);
	
			System.out.print("\nSal�rio Liquido: R$ = " + SL);
	}
}
