package entities;

public class Preguiça extends Animal{
	
	public Preguiça (String nome, int idade) {
		super(nome,idade);
	}
	
	public void emitirSom (String som){
		System.out.println(som);
	}
	public void subirArvore() {
		System.out.println("Subindo a arvore");
	}
	

}
