package br.com.estacio.padroesprojeto.app;

import java.util.Scanner;

import br.com.estacio.padroesprojeto.controlador.Contas;
import br.com.estacio.padroesprojeto.controlador.TransacaoFacade;
import br.com.estacio.padroesprojeto.recursos.CarregarInfo;

public class Aplicacao {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		CarregarInfo baseDados = new CarregarInfo();
		Contas contas = baseDados.load();
		TransacaoFacade facade = new TransacaoFacade();
		facade.setContas(contas);

		System.out.println("Agência:");
		int agencia = scanner.nextInt();
		
		System.out.println("Conta:");
		int conta = scanner.nextInt();
		
		System.out.println("1- Sacar / 2- Depositar");
		int opcao = scanner.nextInt();
		
		System.out.println("Valor:");
		double valor = scanner.nextDouble();

		switch (opcao) {
		case 1:
			
			double saldo = facade.sacar(agencia, conta, valor);
			
			if (saldo != -1) {
				
				System.out.println("Saldo atual: " + saldo);
			} else {
				
				System.out.println("Saldo insuficiente.");
			} // if - else
			
			break;
			
		case 2:
			
			double deposito = facade.deposito(agencia, conta, valor);
			
			if (deposito != -1) {
				
				System.out.println("Saldo atual: " + deposito);
			} else {
				
				System.out.println("Valor inválido.");
			} // if - else
			
			break;

		default:
			
			System.out.println("Opção inválida.");
			break;
		} // switch
		
	}
}
