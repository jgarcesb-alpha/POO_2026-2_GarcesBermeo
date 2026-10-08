/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Garces
 */
public class Automovil {
    //Atributos de la clase Automovil
    String marca;
    String modelo;
    int motor;
    public enum tipoCombustible{GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GNV};
    tipoCombustible tipoCombustible;
    public enum tipoAuto{CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJERCUTIVO, SUV};
    tipoAuto tipoAuto;
    int puertas;
    int asientos;
    int Vmax;
    public enum color{BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA};
    color color;
    int Vactual;
    boolean automatico;
    int multas;

    public Automovil(){
    }
    
    public Automovil(String marca, String modelo, int motor, tipoCombustible tipoCombustible, tipoAuto tipoAuto, int puertas, int asientos, int Vmax, color color, int Vactual, boolean automatico, int multas) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAuto = tipoAuto;
        this.puertas = puertas;
        this.asientos = asientos;
        this.Vmax = Vmax;
        this.color = color;
        this.Vactual = Vactual;
        this.automatico = automatico;
        this.multas = multas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public tipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(tipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public tipoAuto getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(tipoAuto tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public int getVmax() {
        return Vmax;
    }

    public void setVmax(int Vmax) {
        this.Vmax = Vmax;
    }

    public color getColor() {
        return color;
    }

    public void setColor(color color) {
        this.color = color;
    }

    public int getVactual() {
        return Vactual;
    }

    public void setVactual(int Vactual) {
        this.Vactual = Vactual;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    public int getMultas() {
        return multas;
    }

    public void setMultas(int multas) {
        this.multas = multas;
    }
    

    public void ImprimirAtributos(){
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Motor: "+ motor + "cc");
        System.out.println("Combustible: " + tipoCombustible);
        System.out.println("Auto: " + tipoAuto);
        System.out.println("Puertas: " + puertas);
        System.out.println("Cantidad de Asientos: " + asientos);
        System.out.println("Velocidad maxima: " + Vmax);
        System.out.println("Color: " + color);
        System.out.println("Automatico: " + automatico);
        System.out.println("Velocidad actual: " + Vactual);
    }
    
    public void Acelerar(int acelerado){
        Vactual += acelerado;
        if (Vactual > Vmax){
            multas += 1000;
        }
    }    
    
    //Se incorpora la variable frenado para controlar 
    public void desacelerar(int frenado){
        if (Vactual >= frenado){
            Vactual -= frenado;
            System.out.println("Velocidad actual: " + Vactual);
        }
        else{
            System.out.println("No se puede tener una velocidad negativa");
        }
    }
    
    public void frenar(){
        Vactual = 0;
        System.out.println("Velocidad actual: " + Vactual);
    }
    
    public void checkMultas(){
        if (multas==0){
            System.out.println("No se tienen multas");
        }
        else{
            System.out.println("El vehiculo ha sido multado");
            valorMultas();
        }
    }
    
    public void valorMultas(){
        System.out.println("Valor multas: " + multas);
    }
    
    double tiempoLlegada(int Distancia){
       return (double) Distancia/Vactual;
    }
}
