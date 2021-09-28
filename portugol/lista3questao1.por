programa
{
	inclua biblioteca Matematica 
	funcao inicio()
	{
	real salario,somaSalario=0, mediaSalario, somaFilhos=0, mediaFilhos, maiorSalario=0, percentAbaixo=0.00
	real salarioAbaixo=0.00
	inteiro filhos
		para (inteiro x=1; x<=3; x++){
			escreva("Digite o seu salario :")
			leia(salario)
			escreva("Digite o numero de filhos: ")
			leia(filhos)
			somaSalario=salario+somaSalario
			somaFilhos=filhos+somaFilhos 
			se (salario>=maiorSalario){
				maiorSalario= salario
			}
			se (salario <= 100){
				salarioAbaixo++
			}
			
			
			
		}
	mediaSalario=somaSalario/3
	mediaFilhos=somaFilhos/3
	percentAbaixo= (salarioAbaixo/3)*100
	
	escreva(" A media salarial é de : ",Matematica.arredondar(mediaSalario, 2))
	escreva("\n A media de filhos é de : ",Matematica.arredondar(mediaFilhos, 2))
	escreva(" \nO maior salario é : ",maiorSalario)
     escreva(" \n O percentual de pessoas com salario abaixo de 100 reais é: ",percentAbaixo,"% ")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 196; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */