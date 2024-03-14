/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quadrante;

import java.util.Scanner;

/**
 *
 * @author Alvaro
 */
public class Quadrante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Digite o valor de x: ");
        double x = scanner.nextDouble();
        
        System.out.print("Digite o valor de y: ");
        double y = scanner.nextDouble();
        
        Point point = new Point(x, y);
        
        System.out.println("O ponto (" + point.getX() + ", " + point.getY() + ") está no " + point.getQuadrant() + ".");
        }
    }
}

class Point {
    private final double x;
    private final double y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public String getQuadrant() {
        if (x > 0 && y > 0) {
            return "primeiro quadrante1 (Q1)";
        } else if (x < 0 && y > 0) {
            return "segundo quadrante (Q2)";
        } else if (x < 0 && y < 0) {
            return "terceiro quadrante (Q3)";
        } else if (x > 0 && y < 0) {
            return "quarto quadrante (Q4)";
        } else if (x == 0 && y != 0) {
            return "sobre o eixo Y";
        } else if (y == 0 && x != 0) {
            return "sobre o eixo X";
        } else {
            return "origem";
        }
    }
}
        // TODO code application logic here
    
