import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercicio14 {
    public static void main(String[] args) {
        int n1;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println(" Digite o numero ");
        n1 = teclado.nextInt();

        if (n1 % 2 == 0) {
            System.out.println("Numero Par");
            
        }if (n1%2 != 0) {
            System.out.println("Numero impar ");
            
        }if (n1 > 0) {
            System.out.println("Numero maior que zero");            
        }if (n1<0) {
            System.out.println("Numero menor que zero");
        }
teclado.close();
    }
}
