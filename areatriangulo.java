package sequenciais;
import java.util.Scanner;
public class areatriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declara��o das vari�veis.
  		int base; 
  		int altura;
  		int area;
  		
	  	//Entradas de dados
  		Scanner teclado = new Scanner(System.in);
  		
  		System.out.println("Base:");
  		base = teclado.nextInt();

  		System.out.println("Altura:");
  		altura = teclado.nextInt();

  		area = base * altura / 2;
  		
	  	//Processamento e Sa�da
 		System.out.println("Area:" + area);
 		
 		teclado.close();
	}

}
