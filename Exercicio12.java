import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        float p, m=0,e=0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o peso do peixe ");
        p = teclado.nextFloat();
        
        if (p > 50) {
            
            e = p - 50;
            m = e *4;
            System.out.println("O peso do Peixe é "+ p);
            System.out.println("O peso em excesso é de " + e);
            System.out.println("O valor da multa em R$ é "+m);
      }if (p<50){
        System.out.println("O peso do Peixe é "+ p);
        System.out.println("O peso em excesso é de " + e);
        System.out.println("O valor da multa em R$ é "+m);
      }

teclado.close();
    }
}
