package sequenciais;
import java.util.Scanner;
public class multiplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declara��o das vari�veis
			int N1;
			int N2;
			int multiplicacao;
			
		//In�cio
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Digite o primeiro n�mero: ");
			N1 = teclado.nextInt();
			
			System.out.println("Digite o segundo n�mero: ");
			N2 = teclado.nextInt();
			
		//Processamento
			multiplicacao = N1 * N2;
		
		//Fim
			System.out.println("O resultado da multiplia��o �: " + multiplicacao);
			
teclado.close();

					
				
					
					
			
	}

}
