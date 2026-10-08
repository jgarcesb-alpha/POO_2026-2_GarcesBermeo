/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Garces
 */
public class Cuadrado {
    
    double lado;
    
    public Cuadrado(double lado){
        this.lado = lado;
    }
    
    double areaCuadrado(){
        return (double) Math.pow(lado, 2);
    }
    
    double perimetroCuadrado(){
        return (double) 4*lado;
    }
    
}
