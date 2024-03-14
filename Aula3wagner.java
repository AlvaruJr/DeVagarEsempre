package com.mycompany.aula3wagner;
import java.util.Scanner;
        
public class Aula3wagner {


    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();
        
        if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número não é negativo.");
        }
        
        // Fechando o scanner
        scanner.close();
    }
}
    
   

