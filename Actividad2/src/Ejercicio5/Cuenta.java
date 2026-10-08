/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author Garces
 */
public class Cuenta {
    String Nombres, Apellidos;
    int numeroCuenta;
    public enum tipoCuenta{CORRIENTE, AHORROS};
    tipoCuenta tipoCuenta;
    double saldoCuenta=0;
    double interes;

    public Cuenta(String Nombres, String Apellidos, int numeroCuenta, tipoCuenta tipoCuenta, double interes) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.interes = interes;
    }
    
    void ImprimirAtributos(){
        System.out.println("===Datos de la cuenta===");
        System.out.println("Nombres: " + Nombres);
        System.out.println("Apellidos" + Apellidos);
        System.out.println("Numero de Cuenta: " + numeroCuenta);
        System.out.println("Tipo de Cuenta: " + tipoCuenta);
        System.out.println("Saldo de Cuenta: " + saldoCuenta);
        System.out.println("Tasa de interes (%) N.M.: " + interes);
    }
    
    void consignar(double consignacion){
        saldoCuenta += consignacion;
    }
    
    void interes(int meses){
        //Los centavos quedan de ganancia para el banco.
        saldoCuenta = Math.round(saldoCuenta*Math.pow((1+interes/100), meses));
    }
}
