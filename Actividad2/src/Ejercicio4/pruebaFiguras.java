/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Garces
 */
public class pruebaFiguras {
    
    public static void main(String[] args){
        Circulo figura1 = new Circulo(5);
        Rectangulo figura2 = new Rectangulo(5, 3);
        Cuadrado figura3 = new Cuadrado(4);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(4.5, 3);
        Rombo figura5 = new Rombo(2, 3);
        Trapecio figura6 = new Trapecio(5, 4, 7);
        
        
        //Imprimiendo los valores del Circulo
        System.out.println("Area del circulo: " + figura1.calcularArea());
        System.out.println("Perimetro del circulo: "+ figura1.calcularPerimetro());
        
        //Imprimiendo los valores del Rectangulo
        System.out.println("Area del rectangulo " + figura2.calcularArea());
        System.out.println("Perimetro del rectangulo: " + figura2.calcularPerimetro());
        
        //Imprimiendo los valores del Cuadrado
        System.out.println("Area del cuadrado: " + figura3.areaCuadrado());
        System.out.println("Perimetro del cuadrado: " + figura3.perimetroCuadrado());
        
        //Imprimiendo los valores del Triangulo Rectangulo
        System.out.println("Area del triangulo rectangulo: " + figura4.areaTriangulo());
        System.out.println("Perimetro del triangulo rectangulo: " + figura4.perimetroTriangulo());
        figura4.determinarTipoRectangulo();
        
        //Imprimiendo los valores del Rombo
        System.out.println("Area del Rombo: " + figura5.areaRombo());
        System.out.println("Perimetro del Rombo: " + figura5.perimetroRombo());
        
        //Imprimiendo los valores del Trapecio
        System.out.println("Area del trapecio: " + figura6.areaTrapecio());
        System.out.println("Perimetro del Trapecio (Rectangulo): " + figura6.perimetro());
    }
    
}
