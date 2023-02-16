import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        int valor,a ,b;
        Scanner teclado = new Scanner(System.in);

        valor=teclado.nextInt();

        if (valor > 0) {
            a=valor;
            System.out.println("Valor positivo");
            System.out.println(a);
        }else{
            b=valor;
            System.out.println("Valor negativo");
             System.out.println(b);
        }
        teclado.close();

}
}