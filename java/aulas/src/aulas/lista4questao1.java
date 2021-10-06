package aulas;

import java.util.Locale;
import java.util.Scanner;

public class lista4questao1 {
	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner leia = new Scanner(System.in);
	
	double nota[]= new double[5],maiorNota=0;
	
	for (int x=0;x<5;x++) {
		System.out.printf("Escreva a sua nota: ");
		nota[x]=leia.nextDouble();
		if (nota[x]>maiorNota) {
			maiorNota=nota[x];
		}
	}
	System.out.printf("Suas notas foram %.2f,%.2f,%.2f,%.2f,%.2f e a sua maior nota foi %.2f",nota[0],nota[1],nota[2],nota[3],nota[4],maiorNota);
	}
}
