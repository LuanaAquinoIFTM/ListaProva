import java.util.Scanner;

public class exercicio07{

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o valor do produto: ");
        double valor = entrada.nextDouble();

        System.out.print("Informe a sigla do estado: ");
        String estado = entrada.next();

        switch (estado) {
            case "MG":
            double total;
            total = (valor + (valor*0.07));
            System.out.println("O preço final do produto é de " + total + " reais.");

                break;

            case "SP":
            double total1;
            total1 = (valor + (valor*0.12));
            System.out.println("O preço final do produto é de " + total1 + " reais.");

               break;

            case "RJ":
            double total2;
            total2 = (valor + (valor*0.15));
            System.out.println("O preço final do produto é de " + total2 + " reais.");

              break;

            case "MS":
            double total3;
            total3 = (valor + (valor*0.08));
            System.out.println("O preço final do produto é de " + total3 + " reais.");
              
              break;

            default:
            System.out.println("Estado inválido!");
            
        }


    }
}