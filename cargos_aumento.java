package sequenciais;
import java.util.Scanner;
public class cargos_aumento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		double sal, novosal, aumento;
		String nomefunc;
	
	Scanner teclado = new Scanner(System.in);
	
		System.out.println("Informe o nome do funcion�rio: ");
		nomefunc = teclado.next();
	
		System.out.println("Informe o sal�rio do funcion�rio" + nomefunc +":");
		sal = teclado.nextDouble();
	
	System.out.println("Digite o n�mero correspondente ao seu cargo\n"
			+ "1 - Escritu�rio\n"
			+ "2 - Secret�rio\n"
			+ "3 - Caixa\n"
			+ "4 - Gerente\n"
			+ "5 - Diretor");
	n = teclado.nextInt();
	
	switch (n)
	{
		case 1:
			aumento = sal * 0.50;
			novosal = sal + aumento;
			System.out.println("O funcion�rio " + nomefunc + ", do cargo Escritu�rio\n"
                    + "Recebe aumento no sal�rio de 50% = R$" + aumento + "\n"
                            + "Do sal�rio atual: R$" + sal + ", � feito um reajuste para: R$" + novosal);
        break;
		
		
		case 2:
			aumento = sal * 0.35;
			novosal  = sal + aumento;
			System.out.println("O funcion�rio " + nomefunc + ", do cargo Secret�rio\n"
                    + "Recebe aumento no sal�rio de 35% = R$" + aumento + "\n"
                            + "Do sal�rio atual: R$" + sal + ", � feito um reajuste para: R$" + novosal);
			break;
		
		case 3:
			aumento = sal * 0.20;
			novosal = sal + aumento;
			System.out.println("O funcion�rio " + nomefunc + ", do cargo Caixa\n"
                    + "Recebe aumento no sal�rio de 20% = R$" + aumento + "\n"
                            + "Do sal�rio atual: R$" + sal + ", � feito um reajuste para: R$" + novosal);
			break;
			
		case 4:
			aumento = sal * 0.10;
			novosal = sal + aumento;
			System.out.println("O funcion�rio " + nomefunc + ", do cargo Gerente\n"
                    + "Recebe aumento no sal�rio de 10% = R$" + aumento + "\n"
                            + "Do sal�rio atual: R$" + sal + ", � feito um reajuste para: R$" + novosal);
			break;
	
		case 5:
			System.out.println("O cargo de Diretor n�o recebe algum tipo de aumento, seu sal�rio � de: R$" + sal +"");
			
		default: System.out.println("N�mero digitado inv�lido!");
		
				
	}
	
teclado.close();
		}
	
	}
