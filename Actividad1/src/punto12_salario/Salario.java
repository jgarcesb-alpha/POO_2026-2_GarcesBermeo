/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad1.punto12_salario;

/**
 *
 * @author Garces
 */
public class Salario {
    
    public static double SalarioBruto(double SalarioHora, double HorasSemana){
        return SalarioHora * HorasSemana;
    }
    
    public static double RetencionFuente(double Retencion, double SalarioBruto){
        return SalarioBruto * Retencion;
    }
    
    public static double SalarioNeto(double SalarioBruto, double RetencionFuente){
        return SalarioBruto - RetencionFuente;
    }
}

class Salario_ejecucion{
    public static void main(String[] args){
        int HorasSemana=48;
        double SalarioHora=5000;
        double Retencion=0.125;
        
        double SalarioBruto = Salario.SalarioBruto(SalarioHora, HorasSemana);
        double RetencionFuente = Salario.RetencionFuente(Retencion, SalarioBruto);
        double SalarioNeto = Salario.SalarioNeto(SalarioBruto, RetencionFuente);
        
        System.out.println("El salario bruto del trabajador es: $" + SalarioBruto);
        System.out.println("La retencion en fuente es: $" + RetencionFuente);
        System.out.println("El salario neto percibido por el trabajador es de: $" + SalarioNeto);
    }
}
