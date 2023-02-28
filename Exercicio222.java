import java.util.Scanner;

public class Exercicio222 {
    public static void main(String[] args) {
       int contador_total=0, contador_sit_1=0, contador_sit_2 = 0, contador_sit_3 = 0, contador_sit_4=0,
       identificacao,defeito;
       
       Scanner teclado= new Scanner(System.in);

       System.out.println("Informe a identificação: ");
       identificacao = teclado.nextInt();

       while (identificacao != 0) {
        System.out.println("1 - Necessita de esfera.");
        System.out.println("2 - Necessita de limpeza.");
        System.out.println("3 - Necessita de troca de cabo ou conector.");
        System.out.println("4 - quebrado ou inutilizado");
        System.out.println("5 - Informe o defeito");
        defeito = teclado.nextInt();

        if (defeito ==1) {
           contador_sit_1 = contador_sit_1 +1;
        } if (defeito ==2) {
            contador_sit_2 = contador_sit_2 +1;
         } if (defeito ==3) {
            contador_sit_3 = contador_sit_3 +1;
         } if (defeito ==4) {
            contador_sit_4 = contador_sit_4 +1;
         }
         contador_total=contador_total+1;
         System.out.println("Informe a identificação: ");
       identificacao = teclado.nextInt();

       }
       float p1, p2,p3,p4;
       p1 = ((float)contador_sit_1/(float)contador_total)*(float)100;
       p2 = ((float)contador_sit_2/(float)contador_total)*(float)100;
       p3 = ((float)contador_sit_3/(float)contador_total)*(float)100;
       p4 = ((float)contador_sit_4/(float)contador_total)*(float)100;

       System.out.printf("Quantidade de mouse %d\n", contador_total);
       System.out.println("Situação \t\t\t\t\tQuantidade \tPercentual");
       System.out.printf("1- Necessidade de esfera \t\t\t%d\t\t%.2f\n",contador_sit_1,p1);
       System.out.printf("2- Necessidade de Limpeza \t\t\t%d\t\t%.2f\n",contador_sit_2,p2);
       System.out.printf("3- Necessita trocar do cabo ou conector \t%d\t\t%.2f\n",contador_sit_3,p3);
       System.out.printf("4- Quebrado ou inutilizado\t\t\t%d\t\t%.2f",contador_sit_4,p4);
       teclado.close();

    }
}
