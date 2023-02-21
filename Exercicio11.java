import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        float altura,peso_ideial;
        char sexo;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o sexo  m/f");
        sexo=teclado.next().charAt(0);
        System.out.println("Digite a altura ");
        altura=teclado.nextFloat();

        if (sexo == 'm') {
            peso_ideial=(float)((72.7*altura)-58);
            System.out.println("Seu peso Ideal é  "+peso_ideial);
            
        }if (sexo == 'f'){
            peso_ideial=(float)((62.1*altura)-44.7);
            System.out.println("Seu peso Ideal é  "+peso_ideial);
        }
        teclado.close();




    }
}
