import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        int n;
        Scanner teclado = new Scanner(System.in);

        n=teclado.nextInt();

        if (n > 100) {
            System.out.println(n);
        }else{
            n=0;
            System.out.println(n);
        }
        teclado.close();


    }
}
