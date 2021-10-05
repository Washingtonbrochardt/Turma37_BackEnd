package aulas;

import java.util.Locale;
import java.util.Scanner;

public class lista3questao5 {
	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner leia = new Scanner(System.in);
	
	double x,soma=0;
	
	do {
		System.out.printf("Digite um numero: ");
		x = leia.nextDouble();
		soma=soma+x;
		
	}while(x!=0);
	
	System.out.println(soma);
		
	}
}