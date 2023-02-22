import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        float poluicao;
        Scanner teclado = new Scanner(System.in);

        System.out.println(" Digite o nivel de poluição ");
        poluicao = teclado.nextFloat();

        if (poluicao >= 0.3 && poluicao < 0.4) {
            System.out.println("Grupo 1 Suspender atividades ");  
        }if (poluicao >= 0.4 && poluicao < 0.5) {
            System.out.println(" Grupo 1 e Grupo 2 suspender atividadades");
        }if (poluicao >= 0.5 ) {
            System.out.println(" Todos os grupos suspender atividades");
        }if (poluicao < 0.29) {
            System.out.println(" Niveis aceitaveis");   
        }
        teclado.close();
        }




    }

