package VETORES;
import java.util.Scanner;
public class EXERCICIO04 {

	public static void main(String[] args) {
		// Fa�a um algoritmo que armazene 5 n�meros. Ap�s a leitura dos dados armazene na posi��o 3 do vetor o valor 100. Depois mostre todos os valores na tela 
		int numeros[] = new int[5];
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Informe na posic�o " +(i+1)+ ", um n�mero:");
			numeros[i] = entrada.nextInt();}
		
		entrada.close();
		
		numeros[2] = 100;
		
		for (int i = 0; i < numeros.length; i++) {
		System.out.println("Valores: " +numeros[i]);
		
	
		}
	}
}
