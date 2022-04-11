import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um número inteiro e positivo: ");
        int x = entrada.nextInt();

        System.out.print("Informe o segundo número inteiro e positivo: ");
        int y = entrada.nextInt();

        System.out.print("Informe o terceiro número inteiro e positivo: ");
        int z = entrada.nextInt();

        System.out.print("Informe um número para calcular um tipo de média.\n  Se você digitar o número 1, irei calcular a Média Geométrica.\n  Se você digitar o número 2, irei calcular a Média Ponderada.\n  Se você digitar o número 3, irei calcular a Média Aritmética.\n  ---> Digite o número aqui:  ");
        int média = entrada.nextInt();



        if(média == 1 ){
            double total;
            total = (x*y*z);
            System.out.println("O resultado da Média Geométrica é igual a: " + total );

        }else if (média == 2 ){
            double total;
            total = ((x+2*y+3*z)/6);
            System.out.println("O resultado da Média Ponderada é igual a: " + total );

        }else if(média == 3){
            double total;
            total = ((x+y+z)/3);
            System.out.println("O resultado da Média Aritmética é igual a: " + total );

        }
    }
}