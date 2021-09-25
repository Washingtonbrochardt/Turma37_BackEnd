programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{
	real P,M,E,u 
	escreva(" Há quantos quilos de tomate?\n ") 
	leia(P)
	E=P-50
	u=0
	se (E>0){
		u=Matematica.arredondar(E,0)
	     M=4*u
	     escreva(" O peso do tomate excedeu ",E," quilos e custou ",M," reais de multa")
	
	}
	senao {
		M=4*u
		E=0
	     escreva(" O peso do tomate excedeu ",E," quilos e custou ",M," reais de multa")
	
		
	}
	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 316; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */