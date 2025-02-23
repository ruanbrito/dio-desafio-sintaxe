package com.br.desafio.dio;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		//uma peculiaridade no java, quando se obtém uma variavel int
		//é necessário ter um nextline na próxima captura para dá uma "quebra" e 
		//conseguir pedir a proxima variavel.
		System.out.println("Numero da Conta?");
		int numConta = scan.nextInt();
		scan.nextLine();
		System.out.println("Numero da Agência?");
		String numAgencia = scan.nextLine();
		System.out.println("Nome do Cliente?");
		String nomeCliente = scan.nextLine();
		System.out.println("Quantia para depósito?");
		double saldoConta = scan.nextDouble();
		
		
		System.out.println("Olá ".concat(nomeCliente) + 
							", obrigado por criar uma conta em nosso banco,\nsua agência é ".concat(numAgencia) +
							", conta " + numConta + " e seu saldo R$" + saldoConta + " já está disponível para saque");		
		
		scan.close();

	}

}
