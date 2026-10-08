/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad1.punto5_pruebaEscritorio;

/**
 *
 * @author Garces
 */
public class PruebaEscritorio {
    
    public static void main(String[] args){
        
        /*
        Se crean variables de tipo "double" para permitir operaciones con decimales
        */
        double suma=0;
        double x=20;
        suma = suma + x;
        double y=40;
        
        /*
        Se llama la función del módulo Math para elevar el npumero y al cuadrado
        */
        x = x + Math.pow(y,2);
        
        /*
        Aqui se ve la razon de poner las variables en modo "double"
        */
        suma = suma + (x/y);
        
        /*
        Se imprime el valor total de la suma
        */
        System.out.println("El valor de la suma es: " + suma);
    }
    
}
