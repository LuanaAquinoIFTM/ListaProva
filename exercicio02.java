import java.util.Scanner;

public class exercicio02 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("--------Calculadora--------");

        System.out.print("Informe o primeiro número para a operação: ");
        double num1 = entrada.nextDouble();

        System.out.print("Informe a operação(+, -, * ou /): ");
        char oper = entrada.next().charAt(0);
                
        System.out.print("Informe o segundo número para a operação: ");
        double num2 = entrada.nextDouble();
    
         if(oper == '+'){
            double soma;
            soma = (num1 + num2);
            System.out.println("O total da soma é: " + soma);
        }else if(oper == '-'){
            double subtracao;
            subtracao = (num1 - num2);
            System.out.println("O total da subtração é: " + subtracao);
        }else if(oper == '*'){
            double multiplicacao;
            multiplicacao = (num1 * num2);
            System.out.println("O total da multiplicação é: " + multiplicacao);
        }else if(oper == '/'){
            double divisao;
            divisao = (num1 / num2);
            System.out.println("O total da divisão é: " + divisao);
        }    

    }
}
    

