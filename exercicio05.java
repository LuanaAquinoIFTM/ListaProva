import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um número: ");
        double numero = entrada.nextDouble();
    
        if(numero > 0){
            double quadrado;
            quadrado = (numero*numero);
            System.out.println("Esse número ao quadrado é igual a: " + quadrado );
            double raiz;
            raiz = Math.sqrt(numero);
            System.out.println("A raiz quadrada desse número é igual a: " + raiz );
        }else{
            System.out.println("O número não é positivo");
        }    

    }
}
    

