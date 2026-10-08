/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad1.punto14_cuadradoCubo;
import java.util.Scanner;

/**
 *
 * @author Garces
 */
public class CuboCuadrado {
    
    public static double cubo(double numero){
        return Math.pow(numero, 3);
    }
    
    public static double cuadrado(double numero){
        return Math.pow(numero, 2);
    }
}

class CuboCuadrado_ejecucion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero:");
        double numero=sc.nextDouble();
        
        double cubo = CuboCuadrado.cubo(numero);
        double cuadrado = CuboCuadrado.cuadrado(numero);
        
        System.out.println("El cuadrado del numero es: " + cubo);
        System.out.println("El cuadrado del numero es: " + cuadrado);
        
    }
}