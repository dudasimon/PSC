package sequenciais;
import java.util.Scanner;
public class soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declara��o das vari�veis
		int N1;
		int N2;
		int soma;
	
	//In�cio
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		N1 = teclado.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		N2 = teclado.nextInt();
		
	//Processamento
		soma = N1 + N2;
		
	//Fim
		System.out.println("O resultado da soma � " + soma);
		
teclado.close();
	}

}
