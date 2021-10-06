package aulas;

import java.util.Locale;
import java.util.Scanner;

public class lista4questao4 {
	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner leia = new Scanner(System.in);
	
	double mat[][]= new double [3][3],soma=0,diagonal;
	
	for (int x=0;x<3;x++) {
		for (int y=0;y<3;y++) {
			
			System.out.printf("Digite o elemento da posiçao [%d] [%d] da matriz ",x+1,y+1);
			mat[x][y]= leia.nextDouble();
			soma+=mat[x][y];
			
		}
	}
	diagonal = mat[0][0]+mat[1][1]+mat[2][2];
	System.out.printf("A soma de todos os valores é %.2f e a soma dos valores da diagonal é %.2f",soma,diagonal);
	}
}