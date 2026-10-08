/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author Garces
 */
import Ejercicio5.Cuenta.tipoCuenta;

public class CuentaBancaria {
    
    public static void main(String[] args){
        Cuenta cuenta1 = new Cuenta("Juan", "Garces", 7256946, tipoCuenta.CORRIENTE, 1.5);
        cuenta1.ImprimirAtributos();
        
        //Consignar $300.000
        cuenta1.consignar(300_000);
        //Deposito a 5 meses
        cuenta1.interes(5);
        
        cuenta1.ImprimirAtributos();

    }
    
}
