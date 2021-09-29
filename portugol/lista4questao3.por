programa
{
	
	funcao inicio()
	{
		inteiro N1[4][6], N2[4][6], M1[4][6], M2[4][6]
		para(inteiro x=0;x<=3;x++){
			para(inteiro y=0;y<=5;y++){
				escreva("Escreva o elemento da linha ",x+1," e coluna ",y+1," do N1: ")
				leia(N1[x][y])
				
			}
		}
		para(inteiro x=0;x<=3;x++){
			para(inteiro y=0;y<=5;y++){
				escreva("Escreva o elemento da linha ",x+1," e coluna ",y+1," do N2: ")
				leia(N2[x][y])
				
	          }
	       }
	     para(inteiro x=0;x<=3;x++){
			para(inteiro y=0;y<=5;y++){
				M1[x][y]=N1[x][y]+N2[x][y]
				
			}
	     }
	      para(inteiro x=0;x<=3;x++){
			para(inteiro y=0;y<=5;y++){
				M2[x][y]=N1[x][y]-N2[x][y]
				
			}
	     }
	    
	}
}
	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 70; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {N1, 6, 10, 2}-{N2, 6, 20, 2}-{M2, 6, 40, 2}-{M1, 6, 30, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */