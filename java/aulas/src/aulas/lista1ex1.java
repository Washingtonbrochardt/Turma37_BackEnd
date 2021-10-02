package aulas;

import java.util.Scanner;

public class lista1ex1 {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int dia=0,ano=0,mes=0,diaFinal=0;
		
		System.out.print("Digite quantos anos voc� tem: ");
		ano= scan.nextInt();
		System.out.print("\nDigite quantos meses voc� tem: ");
		mes= scan.nextInt();
		System.out.print("\nDigite quantos dias voc� tem: ");
		dia= scan.nextInt();
		
		diaFinal= dia+(mes*30)+(ano*365);
		
		System.out.print("\nVoc� tem "+diaFinal+" dias de vida.");
	}

}