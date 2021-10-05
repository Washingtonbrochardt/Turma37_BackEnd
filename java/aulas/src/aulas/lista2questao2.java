package aulas;

import java.util.Scanner;

public class lista2questao2 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int nume1,nume2,nume3;
		System.out.printf("Digite o primeiro numero: ");
		nume1= leia.nextInt();
		System.out.printf("Digite o segundo numero: ");
		nume2= leia.nextInt();
		System.out.printf("Digite o terceiro numero: ");
		nume3= leia.nextInt();
		if (nume1>=nume2 && nume1>=nume3 ) {
			if(nume2>=nume3) {
				System.out.printf("%d\n%d\n%d",nume3,nume2,nume1);
			}
			else {
				System.out.printf("%d\n%d\n%d",nume2,nume3,nume1);
			}
		}
		else if (nume2>=nume1 && nume2>=nume3 ) {
			if(nume1>=nume3) {
				System.out.printf("%d\n%d\n%d",nume3,nume1,nume2);
			}
			else {
				System.out.printf("%d\n%d\n%d",nume1,nume3,nume2);
			}
		}
		else  {
			if(nume1>=nume2) {
				System.out.printf("%d\n%d\n%d",nume2,nume1,nume3);
			}
			else {
				System.out.printf("%d\n%d\n%d",nume1,nume2,nume3);
			}
		}
	}
}