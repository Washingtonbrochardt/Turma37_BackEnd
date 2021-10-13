package app;

import entities.Animal;
import entities.Cachorro;
import entities.Gato;
import entities.Preguiça;

public class TesteAnimal {
	public static void main(String[] args) {
		
		Animal cachorro= new Cachorro ("Bolt",3,"Vira-lata");
		Animal gato= new Gato ("Miau",5,"Hungara");
		Preguiça preguiça= new Preguiça ("Iag",1);
		
		System.out.println(cachorro.getNome());
		cachorro.correr();
		cachorro.emitirSom("au au");
		System.out.println(gato.getNome());
		gato.correr();
		gato.emitirSom("miau");
		System.out.println(preguiça.getNome());
		preguiça.subirArvore();
		preguiça.emitirSom("arrrrrr");
		
		
		
		
		
	}

}
