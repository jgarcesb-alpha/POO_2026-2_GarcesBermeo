/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Garces
 */
public class TrianguloRectangulo {
    double base, altura;

    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    double areaTriangulo(){
        return base*altura/2;
    }
    
    double perimetroTriangulo(){
        return base+altura+calcularHipotenusa();
    }
    
    double calcularHipotenusa(){
        return Math.pow(base*base + altura*altura, 0.5);
    }
    
    void determinarTipoRectangulo(){
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa())){
            System.out.println("Es un triangulo equilatero.");
        }
        else if ((base!=altura)&&(base!=calcularHipotenusa())&&(altura!=calcularHipotenusa())){
            System.out.println("Es un triangulo escaleno.");
        }
        else{
            System.out.println("Es un triangulo isosceles");
        }
    }
}
