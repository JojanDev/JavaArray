/*
10. Diseñe un algoritmo que almacene en un vector
llamado FIB[100] los 50 primeros números de la serie Fibonacci.
 */
package VISTA;

import MODELO.class10;

/**
 *
 * @author Propietario
 */
public class main10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Datos de entrada, cantidad de numeros
        int cantidad = 50;
        
        class10 modelo = new class10(); //Se crea una instancia
        
        //Se llama al metodo y se envian los datos
        modelo.serieFibonacci(cantidad);
        
        //Se imprimen los resultados
        System.out.println("LOS 50 TERMINOS DE LA SERIE DE FIBONACCI: ");
        
        //Bucle para imprimir el array
        for (long elemento : modelo.serie) {
            System.out.println(elemento);
        }
    }
    
}
