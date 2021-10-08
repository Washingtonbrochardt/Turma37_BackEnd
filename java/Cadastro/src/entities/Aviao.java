package entities;

public class Aviao {
	// atributos
	private String codigo;
	private int qtdePassageiro;
	private double comprimento;
	private String companhia;
	private double velocidade;
	private boolean status;
	// construtor 
	public Aviao (String codigo,int qtdePassageiro, String companhia){
		
		this.codigo=codigo;
		this.qtdePassageiro=qtdePassageiro;
		this.companhia=companhia;
		
	}
	// metodo
	public void decolagem () {
		System.out.printf("O aviao decolou !!");
	}
	public void aterrissagem() {
		System.out.println("Vamos aterrisar");
	}
	
    //encapsulamento
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getQtdePassageiro() {
		return qtdePassageiro;
	}

	public void setQtdePassageiro(int qtdePassageiro) {
		this.qtdePassageiro = qtdePassageiro;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public String getCompanhia() {
		return companhia;
	}

	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	
	

}
