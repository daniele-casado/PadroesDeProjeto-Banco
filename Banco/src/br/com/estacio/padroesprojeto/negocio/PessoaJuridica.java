package br.com.estacio.padroesprojeto.negocio;

public class PessoaJuridica extends Cliente {
	
	private Integer cnpj;
	
	public PessoaJuridica (String nome, Conta conta, Integer cnpj) {
		
		super(nome, conta);
		this.cnpj = cnpj;
	}

	public Integer getCnpj() {
		return cnpj;
	}

	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public double saque (double valor) {
		
		if (super.getConta().getSaldo() >= valor) {
			
			super.getConta().setSaldo(
					super.getConta().getSaldo() - (valor * 1.02));
			return super.getConta().getSaldo();
		} // if
		
		return -1;
	} // saque()
	
}
