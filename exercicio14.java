import java.util.Scanner;

public class exercicio14 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("--------Equação do Segundo Grau--------");

        System.out.print("Digite o coeficiente a: ");
        double coeA = entrada.nextDouble();

        System.out.print("Digite o coeficiente b: ");
        double coeB = entrada.nextDouble();

        System.out.print("Digite o coeficiente c: ");
        double coeC = entrada.nextDouble();

        double delta = ((coeB*coeB) - 4 * (coeA *coeC));

        double x1 = (-coeB + Math.sqrt(delta)) / (2 * coeA);

        double x2 = (-coeB - Math.sqrt(delta)) / (2 * coeA);

        if(delta < 0){
            System.out.println("Não existe raiz.");

        }else if(delta == 0){
            System.out.println("Raiz única.");
            System.out.println("Raiz = " + x1 );

        }else if(delta > 0){
            System.out.println("Existem duas raízes reais. ");
            System.out.println("Raízes: x1 = " + x1 + " x2 = " + x2);
        }
    }
}
