import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        float salario_hora,salario;
        int horas;
        Scanner teclado = new Scanner(System.in);

        System.out.println(" Quantas horas voce trabalha no mes? ");
        horas = teclado.nextInt();

        System.out.println(" Qual o valor da sua hora trabalhada? ");
        salario_hora = teclado.nextInt();

        salario= salario_hora*horas;

        System.out.println(" Seu salario por mês é "+salario);
        teclado.close();


    }
}
