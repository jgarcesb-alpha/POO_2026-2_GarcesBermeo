/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Garces
 */
public class Trapecio {
    
    double baseMayor, baseMenor, altura;

    public Trapecio(double baseMayor, double baseMenor, double altura) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }
    
    double areaTrapecio(){
        return (baseMayor+baseMenor)*altura/2;
    }
    
    double perimetro(){
       
        //Se asume un Trapecio Rectangulo
        
        double b=baseMayor-baseMenor;
        double c=Math.pow(b*b + altura*altura, 0.5);
        double perimetro= baseMayor+baseMenor+altura+c;
        return perimetro;
    }
}
