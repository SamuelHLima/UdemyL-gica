import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        float metros, centimetros;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a medida em metros ");
        metros=teclado.nextInt();

        centimetros = metros *100;

        System.out.println(metros + " metros em centimetros é  " + centimetros);
        teclado.close();



    }
}
