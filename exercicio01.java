import java.util.Scanner;

public class exercicio01 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

            System.out.print("Digite o nome do produto:");
            String nome = entrada.nextLine();

            System.out.print("Digite o modelo do produto:");
            String modelo = entrada.nextLine();

            System.out.print("Digite o tamanho em cm do produto:");
            float tamanho = entrada.nextFloat();

            System.out.print("Digite o preço em reais do produto:");
            double preço = entrada.nextDouble();

            System.out.print("Digite a quantidade do produto:");
            int quantidade= entrada.nextInt();

            System.out.println("Os dados dos produtos. " + 
            " Nome do produto: " + nome + ";" + 
            " Modelo do produto: " + modelo + ";" + 
            " Tamanho do produto: " + tamanho + " cm;" + 
            " Preço do produto: " + preço + ";" + 
            " Quantidade do produto: " + quantidade + "." );
    }
        
}

