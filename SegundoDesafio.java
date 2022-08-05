import java.util.Scanner;

/*
 Faça um programa em Java para ler um número que é um código de usuário. 
 Caso este código seja diferente de um código armazenado internamente no algoritmo 
 (igual a 1234) deve ser apresentada a mensagem ‘Usuário inválido!. 
 Caso o Código seja correto, deve ser lido outro valor que é a senha. 
 Se esta senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta'.
  Caso a senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’.
 */
public class SegundoDesafio {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o código do usuário: ");
		int Code = input.nextInt();

        if (Code == 1234) {
            System.out.print("Digite a senha do usuário: ");
           
            int Password = input.nextInt();

            if (Password == 9999) {
            	System.out.println("Acesso Permitido");
            }
        } else {
            System.out.println("Usuário inválido!");
        }

        input.close();

    }
}
