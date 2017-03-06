package br.com.estacio.padroesprojeto.negocio;

public class PessoaFisica extends Cliente {

	private Integer cpf;
	
	public PessoaFisica (String nome, Conta conta, Integer cpf) {
		
		super(nome, conta);
		this.cpf = cpf;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	@Override
	public double deposito (double valor) {
		
		if (valor > 0) {
			
			super.getConta().setSaldo(
					(super.getConta().getSaldo() + valor) * 1.03);
			return super.getConta().getSaldo();
		} // if
		
		return -1;
	} // deposito() 
}
