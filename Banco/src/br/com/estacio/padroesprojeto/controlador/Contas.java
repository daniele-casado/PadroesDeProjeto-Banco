package br.com.estacio.padroesprojeto.controlador;

import java.util.LinkedList;

import br.com.estacio.padroesprojeto.negocio.Conta;

public class Contas {

	LinkedList<Conta> listaContas;
	
	public Contas () {
		
		listaContas = new LinkedList<Conta>();
	}

	public LinkedList<Conta> getListaContas() {
		return listaContas;
	}

	public void setListaContas(LinkedList<Conta> listaContas) {
		this.listaContas = listaContas;
	}
	
	public Conta encontrarConta(Integer agencia, Integer conta) {
		
		for (Conta c : listaContas) {
			
			if (c.getNrAgencia().equals(agencia) 
					&& c.getNrConta().equals(conta)) {
				
				return c;
			} // if
		} // for
		
		return null;
	} // encontrarConta()
}
