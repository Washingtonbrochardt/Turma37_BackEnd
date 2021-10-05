package aulas;

import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
public class lista3questao3 {
	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner leia = new Scanner(System.in);
	Random random = new Random();
	
	int pessoas = random.nextInt(100);
	int idade[]= new int[pessoas], jovem=0, coroa=0;
	
	for (int x=0;x<pessoas;x++) {
		idade[x]= random.nextInt(100);
		if (idade[x]<21) {
			jovem++;
		}
		else if (idade[x]>50) {
			coroa++;
		}
		else if (idade[x]==-99) {
			break;
		}
		
	}
	System.out.printf("O numero de pessoas abaixo de 21 anos é %d e acima de 50 é %d",jovem,coroa);
	}
}