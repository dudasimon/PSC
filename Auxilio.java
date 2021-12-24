package avaliacao1;
import java.time.LocalDateTime;
import java.util.Scanner;
public class Auxilio {

	public static void main(String[] args) {
			String nome, sobrenome, apos, maiornome1 = "", maiornome2 = "", uf, maiornomem1 = "", maiornomem2 = "";
			int func, cat, vlrbene = 0, valorporcentagemdesconto, opcao, anonasc, anoatual, meses = 0, beneficiarios = 0, vlrtotal = 0, vlrmaior1 = 0, vlrmaior2 = 0, meses1 = 0, meses2 = 0;
			
			Scanner teclado = new Scanner(System.in);
			
			do {
			
			System.out.println("Informe seu nome: ");
			nome = teclado.next();
			
			System.out.println("Informe seu sobrenome: ");
			sobrenome = teclado.next();
			
			System.out.println("Seu nome completo �: "+nome+" "+sobrenome);
			
			
			 System.out.println("Digite o ano de nascimento: ");
		        anonasc = teclado.nextInt();

		        LocalDateTime data1 = LocalDateTime.now();
		        anoatual = data1.getYear();
		        
		        System.out.println("A idade aproximada �: " + (anoatual - anonasc) + " anos");
		        	if (anoatual - anonasc >= 18) {
		        		System.out.println("Voc� est� apto � receber o aux�lio");}
		        	else {
		        		System.out.println("Voc� n�o est� apto � receber o aux�lio");
		        		System.exit(0);}
		        	
			
			System.out.println("Informe a UF em que mora: ");
			 uf = teclado.next();
			 
			 
			 System.out.println("Digite o n�mero correspondente � sua categoria\n"
	                + "1 - Empregado\n"
	                + "2 - Empregador\n"
	                + "3 - Desempregado");
			cat = teclado.nextInt();
			

			 switch (cat)
		        {
		            case 1:
		    			System.out.println("Voc� j� est� aposentado?");
		    			apos = teclado.next();
		    			System.out.println("Para empregados, informe o valor do benef�cio entre R$1000 e R$1800: ");
		    			vlrbene = teclado.nextInt();
		    				if (vlrbene < 1000) {
		    					System.out.println("O valor informado � inv�lido!");System.exit(0); }
		    				
		    				if (vlrbene > 1800) {
		    					System.out.println("O valor informado � inv�lido!"); System.exit(0);}	
		    				System.out.println("Voc� receber� um benef�cio de: R$ " + vlrbene + " por m�s");
		    				
		    				if (apos.equalsIgnoreCase("Sim")) {
			            		meses = 6;
			            		System.out.println("Voc� receber� auxilio durante " + meses + "meses");}
			            	
		    				else { 	
		    					meses = 3;
		    					System.out.println("Voc� receber� auxilio durante " + meses + "meses");}
		    				
		    				
		    				if (uf.equalsIgnoreCase("sp")) {
		    		 			System.out.println("O benef�cio de pessoas que moram em S�o Paulo ter� acr�scimo de 10%");
		    		 			valorporcentagemdesconto = vlrbene * 10/100;
		    		 			vlrbene = vlrbene + valorporcentagemdesconto;
		    		 			System.out.println("Seu benef�cio final � de: R$ " + vlrbene);}
		    				
		    				break;
		            
		            case 2:
		            	System.out.println("Quantos funcion�rios possui sua empresa?");
		            	func = teclado.nextInt();
		            	vlrbene = 200 * func;
		            	if (func <= 10) {
		            		meses = 10;
		            		System.out.println("Voc� receber� auxilio durante " + meses + "meses");}
		            	
		            	else {
		            		System.out.println("Informe quantos meses receber� o aux�lio. (M�nimo 2 e m�ximo 12)");
		            		meses = teclado.nextInt();
		            		System.out.println("Voc� receber� auxilio durante " + meses + "meses");}
		            	
		            	if (func <= 40) {
		            		System.out.println("Voc� receber� um acr�cimo de 11% sobre o valor do auxilio");
		            		valorporcentagemdesconto = vlrbene * 11/100;
			            	vlrbene = vlrbene + valorporcentagemdesconto;
			            	System.out.println("Seu benef�cio final � de: R$ " + vlrbene);}
		            	
		            	if (uf.equalsIgnoreCase("sp")) {
				 			System.out.println("O benef�cio de pessoas que moram em S�o Paulo ter� acr�scimo de 10%");
				 			valorporcentagemdesconto = vlrbene * 10/100;
				 			vlrbene = vlrbene + valorporcentagemdesconto;
				 			System.out.println("Seu benef�cio final � de: R$ " + vlrbene);}
		            	
		            	break;
		        
		            case 3:
		            	System.out.println("H� quantos meses est� desempregado?");
		            	meses = teclado.nextInt();
		            	
		            	System.out.println("Para desempregados, informe o valor do benef�cio entre R$1500 e R$2300: ");
		            	vlrbene = teclado.nextInt();
		    			
		            	
		            	if (vlrbene < 1500) {
	    					System.out.println("O valor informado � inv�lido!"); System.exit(0);}
	    				if (vlrbene > 2300) {
	    					System.out.println("O valor informado � inv�lido!"); System.exit(0);}
	    					
	    					System.out.println("Voc� receber� um benef�cio de: R$ " + vlrbene + " por m�s");
	    					
	    					System.out.println("Informe quantos meses receber� o aux�lio. (M�nimo 2 e m�ximo 12)");
		            		meses = teclado.nextInt();
		            		System.out.println("Voc� receber� auxilio durante " + meses + "meses");
	    				
		            		if (uf.equalsIgnoreCase("sp")) {
	    		 			System.out.println("O benef�cio de pessoas que moram em S�o Paulo ter� acr�scimo de 10%");
	    		 			valorporcentagemdesconto = vlrbene * 10/100;
	    		 			vlrbene = vlrbene + valorporcentagemdesconto;
	    		 			System.out.println("Seu benef�cio final � de: R$ " + vlrbene);}
	    				
	    				break;
		            
		    		default: System.out.println("N�mero digitado inv�lido!");
		                break; }		
			 
			 System.out.println("Gostaria de informar um novo benefici�rio?\n"
					 + "1 - Sim\n"
		             + "2 - N�o");
			 opcao = teclado.nextInt();
			 
			 beneficiarios++;
			 
			 vlrtotal = vlrtotal + vlrbene;
			 		
			 if (vlrbene > vlrmaior1) {
			 	vlrmaior2 = vlrmaior1;
			 	maiornome2 = maiornome1;
				vlrmaior1 = vlrbene;
			 	maiornome1 = nome; }
			 	
			 
			 else if (vlrbene > vlrmaior2) {
				 vlrmaior2 = vlrbene;
				 maiornome2 = nome; }
			 
			 if (meses > meses1) {
				 	meses2 = meses1;
				 	maiornomem2 = maiornomem1;
					meses1 = meses;
				 	maiornomem1 = nome; }
				 	
				 
				 else if (meses > meses2) {
					 meses2 = meses;
					 maiornomem2 = nome; }
			 
			} while(opcao == 1);
			 
			 System.out.println("Quantidade de benefici�rios: " + beneficiarios);
			
			 System.out.println("Valor total concedido: " + vlrtotal);
			
			 System.out.println("Benefici�rio que recebeu o maior valor: " +maiornome1);
			 System.out.println("Benefici�rio que recebeu o segundo maior valor: " +maiornome2);
	
			 System.out.println("Quem recebeu o benef�cio por maior tempo: " +maiornomem1);
			 System.out.println("Quem recebeu o benef�cio por segundo maior tempo: " +maiornomem2);
	
	
			 	teclado.close();
	}
			}		 