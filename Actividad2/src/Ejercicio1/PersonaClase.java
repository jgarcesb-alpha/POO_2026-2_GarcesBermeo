/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Garces
 */
public class PersonaClase {
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona1 = new Persona("Juan Andres", "Martinez Castro", "42786086", 2001, "Colombia", 'H'); 
        Persona persona2 = new Persona("Viktoria Luise", "Stein", "85530883", 2000, "Alemania", 'M');
        
        persona1.ImprimirAtributos();
        persona2.ImprimirAtributos();
    }
        
}
