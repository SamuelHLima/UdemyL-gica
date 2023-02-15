import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args){
        int quantidade_minima, quantidade_maxima;
        float media;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade minima ");
        quantidade_minima = teclado.nextInt();

        System.out.println("Digite a quantidade maxima ");
        quantidade_maxima = teclado.nextInt();

        media= (quantidade_maxima+quantidade_minima)/2;

        System.out.println("A media é "+ media);
        teclado.close();

    }
}
