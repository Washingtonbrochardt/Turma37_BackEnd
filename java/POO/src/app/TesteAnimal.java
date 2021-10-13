package app;

import entities.Animal;
import entities.Cachorro;
import entities.Gato;
import entities.Pregui�a;

public class TesteAnimal {
	public static void main(String[] args) {
		
		Animal cachorro= new Cachorro ("Bolt",3,"Vira-lata");
		Animal gato= new Gato ("Miau",5,"Hungara");
		Pregui�a pregui�a= new Pregui�a ("Iag",1);
		
		System.out.println(cachorro.getNome());
		cachorro.correr();
		cachorro.emitirSom("au au");
		System.out.println(gato.getNome());
		gato.correr();
		gato.emitirSom("miau");
		System.out.println(pregui�a.getNome());
		pregui�a.subirArvore();
		pregui�a.emitirSom("arrrrrr");
		
		
		
		
		
	}

}
