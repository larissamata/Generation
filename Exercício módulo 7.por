programa
{
	
	
	funcao inicio()
	{
          inteiro vetor[10] = {2,5,1,3,4,9,7,8,10,6}
          inteiro i, tam = 10, copia, j

          escreva ("Sequência desordenada: ")
          para (i = 0; i < tam; i++)
     	     escreva (vetor[i], ",")

          para (i =0; i <tam - 1; i++){
			para (j = 0; j < tam - i -1; j++) {
          		se (vetor[j] < vetor[j+1]) {
          		copia = vetor[j]
          		vetor[j] = vetor[j+1]
          		vetor [j+1] = copia
          		}
          	}
          }
          escreva("\nSequência ordenada em ordem descrescente: ")
          para (i = 0; i < tam; i++)
          escreva (vetor[i], ",")
          	
          }
	}

          
		
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 604; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */