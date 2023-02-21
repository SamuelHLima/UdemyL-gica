import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        
        int n,I,P;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero ");
        n=teclado.nextInt();
        
        if (n % 2 == 0) {
            P=n;
            System.out.println("Numero Par "+ P);
            
        }else{
            I=n;
            System.out.println("Numero Impar "+ I);
        }teclado.close();
    } 
}
