import java.util.Scanner;

public class exercicio13 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite algum número e mostrarei se ele é divisível por 3 ou por 5:  ");
        int num = entrada.nextInt();

        boolean divisao3 = (num % 3 == 0);
        boolean divisao5 = (num % 5 == 0);

        if((divisao3) && (!divisao5)) {
            System.out.println("Esse número é divisível por 3 ");
        }else if ((divisao5) && (!divisao3)){
            System.out.println("Esse número é divisível por 5");
        }else{
            System.out.println("Esse número pode não ser divisível por 3. \n Ou esse número não é divisível por 5. \n Ou ainda esse número é divisível por 3 e por 5 ao mesmo tempo.");
        }

    }
    
}
