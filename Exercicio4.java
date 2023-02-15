import java.util.Scanner;

public class Exercicio4 {
 

    public static void main(String[] args){
        float primeiro, segundo, soma;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro numero ");
        primeiro=teclado.nextInt();
        
        System.out.println("Digite o segundo numero ");
        segundo=teclado.nextInt();

        soma = primeiro+segundo;

        System.out.println("O resultado da soma é " + soma);
        teclado.close();

    }
    
}
