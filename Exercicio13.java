import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        int n1,n2,n3,n4,q1,q2,q3,q4;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero ");
        n1 = teclado.nextInt();
        System.out.println("Digite o segundo numero ");
        n2 = teclado.nextInt();
        System.out.println("Digite o terceiro numero ");
        n3 = teclado.nextInt();
        System.out.println("Digite o quarto numero ");
        n4 = teclado.nextInt();

        q1= n1 * n1;
        q2= n2 * n2;
        q3= n3 * n3;
        q4= n4 * n4;

        if (q3 >= 100) {
            System.out.println(" "+q3);
            
        }if (q3 <= 100) {
            System.out.println(" "+q1);
            System.out.println(" "+q2);
            System.out.println(" "+q3);
            System.out.println(" "+q4);
        }
        teclado.close();


    }
}
