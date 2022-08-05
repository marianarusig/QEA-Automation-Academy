/*
 Proposta: Tem-se um conjunto de dados contendo a altura e o sexo de 10 pessoas. Fazer um programa 
 que calcule e escreva:
	a. a maior e a menor altura do grupo;
	b. média de altura dos homens;
	c. o número de mulheres.
Dica: PODE ser usado Vetores, mas não de forma obrigatória
 */

import java.io.IOException;
import java.util.Scanner;
public class QuartoDesafio {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int people = 10, men = 0, women = 0, uninformed = 0;
        char gender;
        float height = 0, sumHeightMen = 0 ,greatestHeight = 0, shorterHeight = 9999;

        
        for (int i = 0; i < people; i++) {
            
            System.out.print("\nInforme a altura do " + (i+1) + "ª usuário: ");
            height = input.nextFloat();

           
            System.out.print("Informe o gênero (M/F) do usuário: ");
            gender = (char)System.in.read();

            
            if (height > greatestHeight) {
                greatestHeight = height;
            } else {
                shorterHeight = height;                
            }

            
            if (gender == 'M' || gender == 'm') {
                men++;
                sumHeightMen += (height * 1.0);
            } else if (gender == 'F' || gender == 'f') {
                women++;
            } else {
                System.out.println("\nGênero informado incorretamente\n");
                uninformed++;
            }
        } 

        input.close();

        
        System.out.printf("\nA maior altura é: %.2f\nA menor altura é: %.2f", greatestHeight, shorterHeight);
        System.out.printf("\nMedia altura dos homens: %.2f",(sumHeightMen/men));
        System.out.printf("\nQuantidade de mulheres: %s", women);
        System.out.printf("\nGênero não informado ou informado incorretamente: %s\n", uninformed);

    }
}
