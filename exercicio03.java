import java.util.Scanner;

public class exercicio03 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("---Informe dois números e mostrarei qual é maior---");

        System.out.print("Informe o primeiro número: ");
        double num1 = entrada.nextDouble();
                
        System.out.print("Informe o segundo número: ");
        double num2 = entrada.nextDouble();
    
         if(num1 > num2){
            System.out.println("O " + num1 + " é maior");
        }else if(num2 > num1){
            System.out.println("O " + num2 + " é maior");
        }else if(num1 == num2){
            System.out.println("Números iguais");
        }  

    }
}




 