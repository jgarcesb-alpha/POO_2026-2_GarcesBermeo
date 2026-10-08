/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;


import Ejercicio3.Automovil.color;
import Ejercicio3.Automovil.tipoAuto;
import Ejercicio3.Automovil.tipoCombustible;

/**
 *
 * @author Garces
 */
public class AutomovilTest {
    public static void main(String[] args){
        
        //Automovil 1
        Automovil auto1 = new Automovil();
        auto1.setMarca("Chevrolet");
        auto1.setModelo("Sedan");
        auto1.setMotor(1798);
        auto1.setTipoCombustible(tipoCombustible.GASOLINA);
        auto1.setTipoAuto(tipoAuto.CIUDAD);
        auto1.setPuertas(4);
        auto1.setAsientos(5);
        auto1.setVmax(100);
        auto1.setColor(color.NEGRO);
        auto1.setAutomatico(true);
        auto1.setVactual(100); //Inicia la velocidad del vehículo en 100km/h
        
        auto1.ImprimirAtributos();
        int Distancia1 = 50;
        System.out.println("Tiempo de llegada a V actual: " + auto1.tiempoLlegada(Distancia1));
        auto1.Acelerar(50);
        auto1.desacelerar(20);
        auto1.desacelerar(100);
        auto1.frenar();
        auto1.checkMultas();
        System.out.println("=====================");
        
        //Actividad 2
        Automovil auto2 = new Automovil();
        auto2.setMarca("Renault");
        auto2.setModelo("Sandero");
        auto2.setMotor(1600);
        auto2.setTipoCombustible(tipoCombustible.GASOLINA);
        auto2.setTipoAuto(tipoAuto.COMPACTO);
        auto2.setPuertas(5);
        auto2.setAsientos(5);
        auto2.setVmax(100);
        auto2.setColor(color.ROJO);
        auto2.setAutomatico(false);
        auto2.setVactual(100); //Inicia la velocidad del vehículo en 100km/h
        
        auto2.ImprimirAtributos();
        int Distancia2 = 100;
        System.out.println("Tiempo de llegada a V actual: " + auto1.tiempoLlegada(Distancia2));
        auto2.Acelerar(10);
        auto2.desacelerar(20);
        auto2.Acelerar(30);
        auto2.desacelerar(50);
        auto2.frenar();
        auto2.checkMultas();
        System.out.println("=====================");
    }
    
}