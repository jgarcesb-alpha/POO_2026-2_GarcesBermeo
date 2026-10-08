/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

public class Planeta {
    String nombre = null;
    int cantidadSatelites = 0;
    double masaKg = 0;
    double volumenKm3 = 0;
    int diametroKm = 0;
    int distanciaMediaSol = 0;
    enum tipoPlaneta{GASEOSO, TERRESTRE, ENANO}
    tipoPlaneta tipo;
    boolean Observable = false;
    double periodoOrbitalYrs = 0;
    double periodoRotacionDias = 0;
    
    

    boolean esPlanetaExterior(){
        int UA = 149597870;
        return distanciaMediaSol > 3.4*UA;
    }
    
    double Densidad(){
        return masaKg/volumenKm3;
    }

    Planeta(String nombre, int cantidadSatélites, double masa, double volumen, int diámetro, int distanciaSol, tipoPlaneta tipo, boolean Observable, double periodoOrbitalYrs, double periodoRotacionDias) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatélites;
        this.masaKg = masa;
        this.volumenKm3 = volumen;
        this.diametroKm = diámetro;
        this.distanciaMediaSol = distanciaSol;
        this.tipo = tipo;
        this.Observable = Observable;
        this.periodoOrbitalYrs = periodoOrbitalYrs;
        this.periodoRotacionDias = periodoRotacionDias;
    }
    public void ImprimirAtributos(){
        System.out.println("Nombre del planeta: " + nombre);
        System.out.println("Numero de satelites en orbita: " + cantidadSatelites);
        System.out.println("Masa (Kg): " + masaKg);
        System.out.println("Volumen (Km3): " + volumenKm3);
        System.out.println("Diametro (Km): " + diametroKm);
        System.out.println("Distancia Media al Sol (Km): " + distanciaMediaSol);
        System.out.println("Tipo de planeta: "+ tipo);
        System.out.println("Observabilidad: "+ Observable);
        System.out.println("Periodo Orbital (Yrs): " + periodoOrbitalYrs);
        System.out.println("Periodo de Rotacion (Dias): " + periodoRotacionDias);
    }
    
    
}