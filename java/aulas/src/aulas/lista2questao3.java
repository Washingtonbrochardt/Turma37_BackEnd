package aulas;

import java.util.Scanner;

public class lista2questao3 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int idade;
		System.out.printf("Digite sua idade: ");
		idade= leia.nextInt();
		if (idade>=10 && idade<=14) {
			System.out.printf("Voce faz parte do infantil");
		}
		else if (idade>=15 && idade<=17) {
			System.out.printf("Voce faz parte do juvenil");
		}
		else if (idade>=18 && idade<=25) {
			System.out.printf("Voce faz é adulto");
		}
		else {
			System.out.printf("Voce nem faz parte do infantil, juvenil e nem é adulto");
		}
	}
}