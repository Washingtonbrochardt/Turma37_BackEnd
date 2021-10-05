package aulas;

import java.util.Locale;
import java.util.Scanner;

public class lista3questao2 {
	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner leia = new Scanner(System.in);
	
	int par=0,impar=0;
	double nume;
	
	
	for (int x=0;x<10;x++) {
		System.out.printf("Escreva o numero: ");
		nume=leia.nextDouble();
		if (nume%2==0 && nume>0) {
			par++;
			
		}
		else if(nume%2==1 && nume>0) {
			impar++;
		}
		
	}
	System.out.printf("Existem %d numeros pares e ",par);
	System.out.printf("existem %d numeros impares",impar);
	}
	


}
