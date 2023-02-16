import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        float altura, peso_ideal,num1,num2;
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        altura=teclado.nextInt();
        System.out.println("Digite o numero 72,7: ");
        num1=teclado.nextInt();
        System.out.println("Digite o numero 58: ");
        num2=teclado.nextInt();
               
        
        peso_ideal=(float)(altura * num1)-num2;

        System.out.println("Seu peso Ideal é "+ peso_ideal);
        teclado.close();



    }
}
