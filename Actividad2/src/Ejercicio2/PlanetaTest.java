/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import Ejercicio2.Planeta.tipoPlaneta;

/**
 *
 * @author Garces
 */
public class PlanetaTest {
    
    public static void main(String[] args){
        Planeta planeta1 = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12742,150000000, tipoPlaneta.TERRESTRE, true, 1, 1);
        Planeta planeta2 = new Planeta("Jupiter", 97, 1.899E27, 1.4313E15, 139820, 750000000, tipoPlaneta.GASEOSO, true, 11.8, 0.414);
        
        planeta1.ImprimirAtributos();
        System.out.println("Densidad (Kg/Km3): " + planeta1.Densidad());
        System.out.println("Planeta exterior: " + planeta1.esPlanetaExterior());
        System.out.println("------------------------");
        
        planeta2.ImprimirAtributos();
        System.out.println("Densidad (Kg/Km3): " + planeta2.Densidad());
        System.out.println("Planeta exterior: " + planeta2.esPlanetaExterior());
        System.out.println("------------------------");
    }
}
