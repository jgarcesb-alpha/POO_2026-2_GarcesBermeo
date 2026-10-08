/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Garces
 */
public class Persona {
    String Nombre;
    String Apellido;
    String ID;
    int Nacimiento;
    String Pais;
    char Genero;
    

    public Persona(String Nombre, String Apellido, String ID, int Nacimiento, String Pais, char Genero) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.ID = ID;
        this.Nacimiento = Nacimiento;
        this.Pais = Pais;
        this.Genero = Genero;
    }
    
    public void ImprimirAtributos(){
            System.out.println("===DATOS DE LA PERSONA===");
            System.out.println("Nombre: " + Nombre);
            System.out.println("Apellido: " + Apellido);
            System.out.println("ID: " + ID);
            System.out.println("Nacimiento: " + Nacimiento);
            System.out.println("Pais: " + Pais);
            System.out.println("Genero: " + Genero);
            System.out.println("-------------------------");
            
            
        }
    }
    
