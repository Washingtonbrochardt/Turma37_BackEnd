package entities;



public class ContaCorrente extends Conta {
	
	private int contadorTalao;

	public ContaCorrente(int numero, String cpf, int contadorTalao) {
		super(numero, cpf);
		this.contadorTalao = contadorTalao;
	}

	public int getContadorTalao() {
		return contadorTalao;
	}

	public void setContadorTalao(int contadorTalao) {
		this.contadorTalao = contadorTalao;
	}

	public char pedirTalao(char op){
		if(op=='S' && contadorTalao < 3 ) {
			contadorTalao++;
			return 'S';
		}
		else{
			System.out.println("Voc� j� atingiu o limite de 3 tal�es!!");
			return'N';
		}
	}

	public void debito() {
		this.saldo = this.saldo - (contadorTalao* 30.0);
	}

}