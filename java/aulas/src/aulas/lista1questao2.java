package aulas;

import java.util.Scanner;

public class lista1questao2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int dia=0,ano=0,mes=0,diaFinal=0,mesFinal=0;
		System.out.print("Digite o valor referente a quantos dias de vida voc� tem: ");
		dia= scan.nextInt();
		
		diaFinal= dia % 30;
		mes= dia /30;
		ano = mes/12;
		mesFinal= mes - (ano * 12);
		
		System.out.println("Voc� tem "+ano+" anos, "+mesFinal+" meses e "+diaFinal+" dias.");
	}

}