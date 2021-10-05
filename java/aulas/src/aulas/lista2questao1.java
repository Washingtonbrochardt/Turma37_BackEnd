package aulas;

import java.util.Scanner;

public class lista2questao1 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int nume1,nume2,nume3;
		System.out.printf("Digite o primeiro numero: ");
		nume1= leia.nextInt();
		System.out.printf("Digite o segundo numero: ");
		nume2= leia.nextInt();
		System.out.printf("Digite o terceiro numero: ");
		nume3= leia.nextInt();
		if(nume1>=nume2 && nume1>=nume3) {
			System.out.printf(" O numero %d é o maior",nume1);
			
		}
		else if(nume2>=nume1 && nume2>=nume3) {
			System.out.printf(" O numero %d é o maior",nume2);
			
			}
		else {
			System.out.printf(" O numero %d é o maior",nume3);
			
		}
	

     }
}
