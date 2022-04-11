import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o salário do trabalhador: ");
        double salario = entrada.nextDouble();
                
        System.out.print("Informe o valor da prestação do empréstimo: ");
        double prestacao = entrada.nextDouble();
    
        if(prestacao > 0.2*salario){
            System.out.println("Empréstimo não concedido");
        }else{
            System.out.println("Empréstimo concedido");
        }    

    }
}
    

