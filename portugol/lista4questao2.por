programa
{
	
	funcao inicio()
	{
		inteiro dado[10],maxNume=0,maxVezes=0
		real media,soma=0.00
		
		para (inteiro x=0;x<=9;x++){
			escreva("Diga em qual numero caiu: ")
			leia(dado[x])
			soma=dado[x]+soma
			se (dado[x]>=maxNume){
				maxNume=dado[x]
			}
		}
		para (inteiro y=0;y<=9;y++){
			se (dado[y]>=maxNume){
				maxVezes++
			}
		
		}
		media=soma/10
		escreva("A media vai ser : ",media)
		escreva("\n O numero de vezes que caiu a maior pontuaçao foi: ",maxVezes)
		
			
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 420; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */