package sequenciais;
import java.util.Scanner;
public class divisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declara��o das vari�veis
		int dividendo;
		int divisor;
		double divisao;
		
	//Entradas
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o dividendo: ");
		dividendo = teclado.nextInt();
		
		System.out.println("Digite o divisor: ");
		divisor = teclado.nextInt();
		
	//Processamento
		divisao = dividendo / divisor;
		
//Sa�da
		System.out.println("A divis�o �: " + divisao);
		
teclado.close();
	}

}
