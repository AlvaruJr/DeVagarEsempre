/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gruposnum;
import java.util.Scanner;
/**
 *
 * @author Alvaro
 */
public class GruposNum {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um numero de 0 a 100");
    double numero = scanner.nextDouble();
    
    if(numero >=0 && numero<=25){
        System.out.println("Grupo 1 [0 a 25] ");
    }   else if(numero < 25 && numero >= 50){
        System.out.println("Grupo 2 [25 a 50]");
    }   else if(numero < 50 && numero >= 75){
        System.out.println("Grupo 3 [50 a 75]");
    }   else if(numero < 75 && numero >= 100){
        System.out.println("Grupo 4 [75 a 100]");
    }   else {
    }  {
        System.out.println("numero fora do intervalo");
    }
    scanner.close();
    }
    
}
