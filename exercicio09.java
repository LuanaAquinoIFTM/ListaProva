import java.util.Scanner;

public class exercicio09 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Altura: ");
        double altura = entrada.nextDouble();

        System.out.print("Peso: ");
        double peso = entrada.nextDouble();

        if(altura < 1.20 && peso <= 60 ){
            System.out.println("Classificação A");

        }else if (altura < 1.20 && peso >= 60 && peso <= 90 ){
            System.out.println("Classificação D");

        }else if (altura < 1.20 && peso > 90){
            System.out.println("Classificação G");

        }else if (altura >= 1.20 && altura <= 1.70 && peso <= 60){
           System.out.println("Classificação B");

        }else if (altura >= 1.20 && altura <= 1.70 && peso >= 60 && peso <= 90){
            System.out.println("Classificação E");

        }else if(altura >= 1.20 && altura <= 1.70 && peso > 90){
            System.out.println("Classificação H");

        }else if(altura > 1.70 && peso <=60){
            System.out.println("Classificação C");

        }else if(altura > 1.70 && peso >= 60 && peso <= 90){
            System.out.println("Classificação F");

        }else if(altura > 1.70 && peso > 90){
            System.out.println("Classificação I");
        }
        
    
    }
}
