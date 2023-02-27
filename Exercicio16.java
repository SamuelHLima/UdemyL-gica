import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        int Numero, maior=0;
        Scanner teclado = new Scanner(System.in);

        System.out.println(" Digite um numero ");
        Numero = teclado.nextInt();

        
         
        while (Numero != 0) {
            if (Numero > maior) {
                maior = Numero;
                 
            }
            System.out.println(" Digite um numero ");
        Numero = teclado.nextInt();
        }
        System.out.printf("O maior numero é %d", maior);
        teclado.close();
    }
}
