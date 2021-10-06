package aulas;

import java.util.Locale;
import java.util.Scanner;

public class lista4questao2{
	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner leia = new Scanner(System.in);
	
	int dado[]= new int[10],maiorPont=0,contagem=0;
	double media,soma=0.00;
	
	for (int x=0;x<10;x++) {
		System.out.printf(" Escreva o numero que caiu no dado: ");
		dado[x]= leia.nextInt();
		while(dado[x]<=0 || dado[x]>6) {
			System.out.printf(" Escreva corretamente o numero que caiu no dado: ");
			dado[x]= leia.nextInt();
		}
		soma+=dado[x];
		if (dado[x]>=maiorPont) {
			maiorPont=dado[x];
		}
			
		
	}
	for (int x=0;x<10;x++) {
		if (dado[x]==maiorPont) {
			contagem++;
		}
	}
	
		media=soma/6;
		for (int x=0;x<10;x++) {
			System.out.printf(" Na experiencia numero %d o dado caiu no numero %d\n ",x+1,dado[x]);
		
	}
		System.out.printf("A media dos lançamentos foi de %.2f e por %d vezes o dado caiu no maior numero ",media,contagem);
	
	}
	
}