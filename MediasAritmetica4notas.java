package sequencial;

import java.util.Scanner;

public class MediasAritmetica4notasSexo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Delara��o das vari�veis
		int N1;
		int N2;
		int N3;
		int N4;
		
		double media;
		
		char sexo;
		
		//Entradas
		Scanner teclado = new Scanner(System.in); 	
  		
  		System.out.println("Digite a nota 1:");
	  	N1 = teclado.nextInt();	  	
		
	  	System.out.println("Digite a nota 2:");
	  	N2 = teclado.nextInt();	  
	  	
	  	System.out.println("Digite a nota 3:");
	  	N3 = teclado.nextInt();	 	
	  	
	  	System.out.println("Digite a nota 4:");
	  	N4 = teclado.nextInt();	 	  
	  	
	  	System.out.println("Indique o sexo:");
	  	sexo = teclado.next().charAt(0);
	  	
	  	//Processamento
	  	
	  	media = (N1 + N2 + N3 + N4) / 4;
	  	
	  	//Sa�da
	  	if (sexo == 'f') {
	  	if (media < 7) {
	  		System.out.println("A m�dia da aluna �: " + media);
	  		System.out.println("Cara aluna voc� foi reprovada" + media);
	  	} else {
	  		System.out.println("A m�dia da aluna �: " + media);
	  		System.out.println("Cara aluna voc� foi aprovada" + media);
	  
	  
	  	}
	  	}
	}}

	
