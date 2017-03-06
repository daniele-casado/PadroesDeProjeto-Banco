package br.com.estacio.padroesprojeto.negocio;

public class Cliente {

	private String nome;
	private Conta conta;
	
	public Cliente (String nome, Conta conta) {
		
		this.nome = nome;
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public double saque (double valor) {
		
		if (conta.getSaldo() >= valor) {
			
			conta.setSaldo(conta.getSaldo() - valor);
			return conta.getSaldo();
		} // if
		
		return -1;
	} // saque()
	
	public double deposito (double valor) {
		
		if (valor > 0) {
			
			conta.setSaldo(conta.getSaldo() + valor);
			return conta.getSaldo();
		} // if
		
		return -1;
	} // deposito() 
}
