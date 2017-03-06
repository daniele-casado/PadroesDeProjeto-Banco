package br.com.estacio.padroesprojeto.recursos;

import br.com.estacio.padroesprojeto.controlador.Contas;
import br.com.estacio.padroesprojeto.negocio.Cliente;
import br.com.estacio.padroesprojeto.negocio.Conta;
import br.com.estacio.padroesprojeto.negocio.PessoaFisica;
import br.com.estacio.padroesprojeto.negocio.PessoaJuridica;

public class CarregarInfo {

	public Contas load() {
		
		Cliente clientePF = new PessoaFisica("Daniele Casado", null, 11111111);
		Conta contaPF = new Conta(123, 147258, 2500.0, clientePF);
		clientePF.setConta(contaPF);
		contaPF.setCliente(clientePF);
		
		Cliente clientePJ = new PessoaJuridica("Ramon Pontes", null, 22222222);
		Conta contaPJ = new Conta(456, 258369, 1500.0, clientePJ);
		clientePJ.setConta(contaPJ);
		contaPJ.setCliente(clientePJ);
		
		Contas contas = new Contas();
		contas.getListaContas().add(contaPJ);
		contas.getListaContas().add(contaPF);
		
		return contas;
	} // load()
}
