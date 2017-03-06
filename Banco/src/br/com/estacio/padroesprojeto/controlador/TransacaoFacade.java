package br.com.estacio.padroesprojeto.controlador;

import br.com.estacio.padroesprojeto.negocio.Cliente;
import br.com.estacio.padroesprojeto.negocio.Conta;

public class TransacaoFacade {
	
	private Contas contas;
	
	public void setContas(Contas contas) {
		
		this.contas = contas;
	}

	public double sacar(Integer agencia, Integer conta, double valor) {
		
		Conta cont = contas.encontrarConta(agencia, conta);
		
		if (cont == null) {
			
			return -1;
		} // if
		
		Cliente cliente = cont.getCliente();
		
		return cliente.saque(valor);
	} // sacar()
	
	public double deposito(Integer agencia, Integer conta, double valor) {
		
		Conta cont = contas.encontrarConta(agencia, conta);
		
		if (cont == null) {
			
			return -1;
		} // if

		Cliente cliente = cont.getCliente();
		
		return cliente.deposito(valor);
	} // deposito()
}
