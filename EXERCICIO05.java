package VETORES;
import java.util.Scanner;
public class EXERCICIO05 {

	public static void main(String[] args) {
		// Fa�a um algoritmo que armazene 10 valores reais. Ao final apresente: A soma de todos os valores, a m�dia, o menor valor, o maior valor
		int numeros[] = new int[10];
		double media = 0;
		double soma = 0;
		double menor = 0;
		double maior = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Informe o " +(i+1)+ "� valor");
			numeros[i] = entrada.nextInt();
			soma = soma + numeros[i];
			media = soma/10;
		
			if (numeros[i] >= maior) {
				maior = numeros[i];}
			if (numeros[i] <= menor) {
				menor = numeros[i];}
		}	
		System.out.println("O maior n�mero � " +maior);	
		System.out.println("O menor n�mero � " +menor);	
		System.out.println("A soma dos valores � " +soma);
		System.out.println("A m�dia dos valores � " +media); 

		entrada.close();
	}
	
	}
