/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad1.punto17_Circulo;
import java.util.Scanner;

/**
 *
 * @author Garces
 */
public class Circulos {
    
    public static double area(double radio){
        return Math.PI*Math.pow(radio, 2);
    }
    
    public static double perimetro(double radio){
        return 2*Math.PI*radio;
    }
    
}

class Circulos_ejecucion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo:");
        double radio=sc.nextDouble();
        
        double area = Circulos.area(radio);
        double perimetro = Circulos.perimetro(radio);
        
        System.out.println("El area del circulo es: " + area);
        System.out.println("El perimetro del circulo es: " + perimetro);
    }
}
