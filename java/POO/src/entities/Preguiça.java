package entities;

public class Pregui�a extends Animal{
	
	public Pregui�a (String nome, int idade) {
		super(nome,idade);
	}
	
	public void emitirSom (String som){
		System.out.println(som);
	}
	public void subirArvore() {
		System.out.println("Subindo a arvore");
	}
	

}
