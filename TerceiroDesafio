/* Proposta: Fazer um programa em Java que armazene o nome, a idade e a altura dos usuários 
 * e no final mostre como saída quantas pessoas acima de 25 anos e maiores de 1.75 participaram 
 * da pesquisa.
   Comentar o código!
 */
import java.util.Scanner; 

public class TerceiroDesafio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome;
		int idade;
		int contador = 0;
		int opção;
		int acimaDeVinteECincoAnos = 0;
		float altura;
		int totalMaioresDeIdadeEAltura = 0;
		
		System.out.print("****Bem-vindo ao cadastro!**** ");{
		}
		
		do { 
			System.out.print("\n1 - Cadastrar uma nova pessoa.\n" +
		
                "2 - Sair\n" +
                "Opção:  ");
        opção = sc.nextInt();
        
        switch (opção) {
        case 1:
        	System.out.print("\n==== Dados do usuário" + " ====\n");
	
	System.out.print("Digite seu nome: ");
	nome = sc.next();
	System.out.print("Digite sua idade: ");
	idade = sc.nextInt();
	System.out.print("Digite sua altura: ");
	altura = sc.nextFloat();
        
	if (idade >= 25 && altura > 1.75) {
		totalMaioresDeIdadeEAltura++;
	}
	break;
	
	case 2:
       
        if (contador == 0) {
            System.out.println("\nUsuário não cadastrado\n");
        } 

        System.exit(0);
            
    
        default:
            System.out.println("Opção inválida\n");
            break;
        }
        contador ++;
            

    System.out.println(".......");
    System.out.println("Total de pessoas acima de 25 anos e maiores de 1.75cm é: " + totalMaioresDeIdadeEAltura);
		
		
		} while (opção == 1);
		
		
		sc.close();
	     
	}
		
	}
	
