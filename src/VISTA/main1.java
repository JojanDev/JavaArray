/*
1. Crea un array o arreglo unidimensional con un tamaño de 10, inserta los valores numéricos que
desees de la manera que quieras y muestra por pantalla la media de valores del array.
 */
package VISTA;

import MODELO.class1;
import javax.swing.JOptionPane;

/**
 *
 * @author Propietario
 */
public class main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        class1 modelo = new class1(); //Se crea una instancia
        
        int[] numeros = new int[10]; //Se inicializa un array con un tamaño
        
        //Bucle para pedir los datos dependiendo del tamaño de array
        for (int i = 0; i < numeros.length; i++) {
            //Se solicitan los datos
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero " + (i+1) + ": "));
            numeros[i] = numero; //Se almacena el dato en el array
        }
            
        //Se llama al metodo y se envia el dato
        modelo.promediar(numeros);
        
        //Se imprimen los resultados
        JOptionPane.showMessageDialog(null, "EL PROMEDIO DE LA LISTA DE NUMEROS ES: " + modelo.promedio);
    }
    
}
