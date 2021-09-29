programa
{
	
	funcao inicio()
	{
		inteiro mat[3][3],soma=0,diagonal
		para (inteiro x=0;x<=2;x++){
			para(inteiro y=0;y<=2;y++){
				escreva("Diga o elemento da linha ",x+1," e coluna ",y+1,":")
				leia(mat[x][y])
				soma=soma+mat[x][y]
				
			}
		}
		escreva("A soma dos elementos é: ",soma)
		diagonal=mat[0][0]+mat[1][1]+mat[2][2]
		escreva("\nA soma dos elementos da diagonal é: ",diagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 357; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {mat, 6, 10, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */