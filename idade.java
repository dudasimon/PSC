package sequenciais;
import java.util.Scanner;
import java.time.LocalDateTime;
public class idade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declara��o das vari�veis.
  		int anoNascimento; 
  		int anoAtual;
  		
	  	//Entradas de dados
  		Scanner teclado = new Scanner(System.in);
  		
  		System.out.println("Digite o numero 1:");
  		anoNascimento = teclado.nextInt();
  		
  		LocalDateTime data1 = LocalDateTime.now();
  		anoAtual = data1.getYear();
  		
	  	//Processamento e Sa�da
 		System.out.println("Idade:" + (anoAtual-anoNascimento));
 		
 		teclado.close();
	}

}
