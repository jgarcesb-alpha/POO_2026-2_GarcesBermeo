/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Garces
 */
public class Rombo {
    
    double diagonalMenor, diagonalMayor;

    public Rombo(double diagonalMenor, double diagonalMayor) {
        this.diagonalMenor = diagonalMenor;
        this.diagonalMayor = diagonalMayor;
    }
    
    double areaRombo(){
        return diagonalMenor*diagonalMayor/2;
    }

    double perimetroRombo(){
        double a=diagonalMenor/2;
        double b=diagonalMayor/2;
        return Math.pow(a*a + b*b, 0.5)*4;
        }
    
    
}
