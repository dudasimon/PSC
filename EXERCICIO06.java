package VETORES;
import java.util.Scanner;
public class EXERCICIO06 {

	public static void main(String[] args) {
		//Fa�a um algoritmo que leia 10 valores e ao final imprima quantos desses s�o pares e quantos s�o �mpares.
		
		int iContadorPar = 0;
		int iContadorImpar = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		int valores[] = new int[10];
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Informe o " +(i+1)+ "� valor");
			valores[i] = entrada.nextInt();
			
			if (valores[i] % 2 == 0) {
				++iContadorPar;
				continue;}
			
		++iContadorImpar;}
			
		System.out.println("Quantidade de n�meros Par: " +iContadorPar);
		System.out.println("Quantidade de n�meros �mpar: " +iContadorImpar);
	
		entrada.close();
	}

}


