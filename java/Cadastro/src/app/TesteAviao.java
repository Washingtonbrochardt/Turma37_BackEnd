package app;

import java.util.Scanner;

import entities.Aviao;

public class TesteAviao {
	public static void main(String[] args) {
		
		Aviao aviao = new Aviao("G-02",200,"Gol");
		Scanner leia = new Scanner(System.in);
		
		char op = ' ';
		
		System.out.printf(" Voce quer aterrisar ou decolar? A/D: ");
		op = leia.next().toUpperCase().charAt(0);
		
		if(op=='A') {
			
			aviao.aterrissagem();
		}
		if (op=='D') {
			aviao.decolagem();
		}
		
		
	}

}
