package VETORES;
import java.util.Scanner;
public class EXERCICIO01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Fa�a um algoritmo que receba como entrada 5 n�meros. Depois imprima os 5 n�meros na tela
		
		int[] numeros = new int[5];
		Scanner teclado = new Scanner(System.in);
		
		for (int i = numeros.length-1; i > -1; i--) {
			System.out.println("Informe na posi��o "+(i+1)+" um numero: ");
			numeros[i] = teclado.nextInt();
		}
		teclado.close();
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Resultado: "+numeros[i]);
		}
	}
}
