package aulas;

import java.util.Scanner;

public class lista2questao4 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int nume;
		float resto,quadra;
		System.out.printf("Digite seu numero: ");
		nume= leia.nextInt();
		resto=(nume%2);
		quadra=nume*nume;
		if(resto==0) {
			System.out.printf(" O numero � par e sua raiz quadrada � %.2f",Math.sqrt(nume));
		}
		else {
			System.out.printf("O numero � impar e seu quadrado � %.2f ",quadra);
		}
	}
}