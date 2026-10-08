/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Garces
 */
public class Circulo {
    
    double radio;
    

    public Circulo(double radio) {
        this.radio=radio;
    }

    double calcularArea(){
        return Math.PI*radio*Math.pow(radio, 2);
    }
    
    double calcularPerimetro(){
        return 2*Math.PI*radio;
    }
    
}
