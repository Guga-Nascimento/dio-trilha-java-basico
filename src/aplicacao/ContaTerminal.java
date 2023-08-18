package aplicacao;
import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;

public class ContaTerminal {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta cliente;
		
		System.out.print("Por favor, digite o número da Agência!  ");
		String agencia = sc.nextLine();
		System.out.print("Por favor, digite o número da Conta!  ");
		Integer numeroConta = Integer.parseInt(sc.nextLine());
		System.out.print("Por favor, informe seu nome completo!  ");
		String nomeCliente = sc.nextLine();
		System.out.print("Por favor, digite seu saldo inicial!  ");
		Double saldo = sc.nextDouble();
		cliente = new Conta(numeroConta,agencia,nomeCliente,saldo);
		
		System.out.println(cliente);	
		
		sc.close();
	}

}
