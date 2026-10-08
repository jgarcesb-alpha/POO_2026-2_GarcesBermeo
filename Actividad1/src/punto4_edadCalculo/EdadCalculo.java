package Actividad1.punto4_edadCalculo; //Paquete en que está alojada la clase
import java.util.Scanner; //Librería importada para la captura de datos

/**
 *
 * @author Garces
 */
public class EdadCalculo {
    
    /*
    A partir del enunciado, se crean las variables para el cálculo de las edades
    */
    public static double getedadAlber(double edadJuan){
        return edadJuan*2/3;
    }
    
    public static double getedadAna(double edadJuan){
        return edadJuan*4/3;
    }
    
    public static double getedadMadre(double edadJuan, double edadAlber, double edadAna){
        return edadJuan+edadAlber+edadAna;
    }

}

class EdadCalculo_ejecucion{
    public static void main(String[] args){
        System.out.println("Inicio de sistema");
        
        /*Se activa la entrada de datos.
        
        Se crea el objeto sc a partir de la función Scanner para este labor*/
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la edad de Juan:");
        
        /*
        Se solicita al usuario la edad de Juan. Se toma como valor "double" para poder aceptar decimales
        */
        double edadJuan = sc.nextDouble();
        
        /*
        Las siguientes variables llaman atributos de la clase EdadCalculo
        
        Se crean como variables de tipo "double" para evitar errores en los cálculos
        */
        double edadAlber = EdadCalculo.getedadAlber(edadJuan);
        double edadAna = EdadCalculo.getedadAna(edadJuan);
        double edadMadre = EdadCalculo.getedadMadre(edadJuan, edadAlber, edadAna);
        
        /*
        Se imprimen los resultados obtenidos, incluyendo la de Juan
        
        Cada resultado sale en una linea por la instrucción "println"
        */
        System.out.println("La edad de Juan es " + edadJuan);
        System.out.println("La edad de Ana es " + edadAna);
        System.out.println("La edad de Alberto es " + edadAlber);
        System.out.println("La edad de la Madre es " + edadMadre);
    }
}