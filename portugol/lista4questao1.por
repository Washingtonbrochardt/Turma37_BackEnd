programa
{
	
	funcao inicio()
	{
		inteiro nota[5],maxNota=0
		para (inteiro x=0; x<=4;x++){
			escreva("Escreva a sua nota ",x+1," : ")
			leia(nota[x])
			se (nota[x]>=maxNota){
				maxNota=nota[x]
				
			}
			
		}
		para (inteiro y=0;y<=4;y++){
			escreva("A sua nota ",y+1," é ",nota[y],"\n")
			
		}
		escreva("A sua maior nota é: ",maxNota)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 352; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */