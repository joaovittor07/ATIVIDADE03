package LISTA.DE.EXERCICIO2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex32 {
    public static void main(String[] args) {
    	/* O Hipermercado Tabajara est� com uma promo��o de carnes que � imperd�vel. Confira:
 		   				  At� 5 Kg          Acima de 5 Kg
 		   File Duplo:    R$ 4,90 por Kg    R$ 5,80 por Kg
 		   Alcatra:       R$ 5,90 por Kg    R$ 6,80 por Kg
 		   Picanha:       R$ 6,90 por Kg    R$ 7,80 por Kg
 		   
 		   Para atender a todos os clientes, cada cliente poder� levar apenas um dos tipos
 		   de carne da promo��o, por�m n�o h� limites para a quantidade de carne por
 		   cliente. Se compra for feita no cart�o Tabajara o cliente receber� ainda um
 		   desconto de 5% sobre o total a compra. Escreva um programa que pe�a o tipo e
 		   a quantidade de carne comprada pelo usu�rio e gere um cupom fiscal, contendo
 		   as informa��es da compra: tipo e quantidade de carne, pre�o total, tipo de
 		   pagamento, valor do desconto e valor a pagar.*/

        
    	Scanner s = new Scanner(System.in);
        
    	DecimalFormat deci = new DecimalFormat("0.00");

        System.out.print("Digite 1 - (File Duplo), 2 - (Alcatra) ou 3 - (Picanha): ");

        	String numero = s.nextLine();

        System.out.print("\nInforme a quantidade de quilos de carne que voc� deseja: ");
        
        	int kilo = s.nextInt();

        System.out.print("\nVai ser pago com o Cart�o Tabajara? (SIM ou NAO): ");

        	String cartao = s.next();

        double precoPorKilo;

        if (numero.equalsIgnoreCase("1")) {

        	precoPorKilo = (kilo <= 5) ? 4.9 : 5.8;
        	
        } else if (numero.equalsIgnoreCase("2")) {
        	
            precoPorKilo = (kilo <= 5) ? 5.9 : 6.8;
        
        } else if (numero.equalsIgnoreCase("3")) {
        
        	precoPorKilo = (kilo <= 5) ? 6.9 : 7.8;
        
        } else {
           
        	System.out.println("Op��o inv�lida!");
            return;
        }

        double valorTotal = kilo * precoPorKilo;
        
        double desconto = (cartao.equalsIgnoreCase("SIM")) ? (valorTotal * 0.05) : 0;
        
        double valorPago = valorTotal - desconto;

        System.out.println("\nNOTA FISCAL");
        System.out.println("Tipo da Carne: " + numero);
        System.out.println("Quantidade em Kg: " + kilo);
        System.out.println("Pre�o Total: R$ " + deci.format(valorTotal));
        System.out.println("Utilizou o Cart�o Tabajara? " + cartao);
        System.out.println("Valor do Desconto: R$ " + deci.format(desconto));
        System.out.println("Valor Total a ser Pago: R$ " + deci.format(valorPago));
    }
}