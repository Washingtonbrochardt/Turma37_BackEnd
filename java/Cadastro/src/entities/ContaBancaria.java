package entities;

public class ContaBancaria {
	
	//ATRIBUTOS
	private String titular;
	private String cpf;
	private int numeroConta;
	private int agencia;
	private double saldo;
	
	//CONSTRUTOR
	public ContaBancaria (String titular, int numeroConta, int agencia, double saldo) {
		this.titular = titular;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	//M�TODOS
	public void depositar(double valor) {
		saldo += valor;
		
		System.out.printf("\nVOC� DEPOISITOU R$%.2f \n", valor);
		System.out.printf("SEU SALDO AGORA � DE R$%.2f", saldo);
	}
	
	public void sacar(double valor) {
		saldo -= valor; 
		
		System.out.printf("\nVOC� SACOU R$%.2f \n", valor);
		System.out.printf("SEU SALDO AGORA � DE R$%.2f", saldo);
	}

	
	//ENCAPSULAMENTO		
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
}