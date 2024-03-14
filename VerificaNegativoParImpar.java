
package verificanegativoparimpar;

import java.util.Scanner;

public class VerificaNegativoParImpar {
    public static void main(String[] args) {
       
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            
            if (numero < 0) {
                System.out.println("O número é negativo.");
            } else {
                System.out.println("O número não é negativo.");
                
                
                if (numero % 2 == 0) {
                    System.out.println("O número é par.");
                } else {
                    System.out.println("O número é ímpar.");
                }
            }
            
        }
    }
}

    

