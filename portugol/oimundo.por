programa{

	funcao inicio(){
		inteiro ano,mes,dia,ano1,mes1,dia1,idadedias
		escreva ("Em que ano voce nasceu?: ")
		leia(ano)
		escreva("Em que mes voce nasceu?: ")
		leia(mes)
		escreva("Em que dia voce nasceu: ")
		leia(dia)
		ano1= (2021 - ano)*365
		mes1= (9  - mes)*30
		dia1= (23-dia)
		idadedias= ano1+mes1+dia1
		escreva(idadedias)
	}
}
		

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 346; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */