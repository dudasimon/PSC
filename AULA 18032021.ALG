Algoritmo "Aula 18032021"
// 
//  
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Maria Eduarda Simon
// Data atual  : 18/03/2021
Var
// Se��o de Declara��es das vari�veis 
N_1, N_2, N_3, N_4, media: real
sexo : caracter

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
    Escreva("Informe o primeiro n�mero: ")
    Leia(N_1)
    Escreva("Informe o segundo n�mero: ")
    Leia(N_2)
    Escreva("Informe o terceiro n�mero: ")
    Leia(N_3)
    Escreva("Informe o quarto n�mero: ")
    Leia(N_4)
    Escreva("Nos informe seu g�nero: ")
    Leia(sexo)
//Processamento
media <- (N_1 + N_2 + N_3 + N_4) / 4
//Sa�da
   SE (media >= 70) ENTAO
   SE (sexo = "M") ENTAO
   Escreval("A m�dia do aluno �: ", media)
   Escreval("Caro aluno! Voc� foi aprovado!")
SENAO
   Escreval("A m�dia da aluna �: ", media)
   Escreval("Cara aluna! Voc� foi aprovada!")
FIMSE
SENAO
   SE (media < 70) ENTAO
   Escreval("A m�dia do aluno �: ", media)
   Escreval("Caro aluno! Voc� foi reprovado!")
   SENAO
   Escreval("A m�dia da aluna �: ", media)
   Escreval("Cara aluna! Voc� foi reprovada!")
   FIMSE
FIMSE

Fimalgoritmo