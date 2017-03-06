package br.com.estacio.padroesprojeto.negocio;

public class Conta {
	
	private Integer nrAgencia;
	private Integer nrConta;
	private Double saldo;
	private Cliente cliente;
	
	public Conta () {}
	
	public Conta (Integer nrAgencia, Integer nrConta, double saldo, Cliente cliente) {
		
		this.nrAgencia = nrAgencia;
		this.nrConta = nrConta;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	
	public Integer getNrAgencia() {
		return nrAgencia;
	}
	public void setNrAgencia(Integer nrAgencia) {
		this.nrAgencia = nrAgencia;
	}
	public Integer getNrConta() {
		return nrConta;
	}
	public void setNrConta(Integer nrConta) {
		this.nrConta = nrConta;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
