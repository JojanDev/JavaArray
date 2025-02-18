/*
4. Llenar dos vectores A y B de N elementos cada uno, sumar el elemento uno del vector A con el
elemento uno del vector B y así sucesivamente hasta N, almacenar el resultado en un vector C, e
imprimir los dos vectores y el vector resultante.
 */
package VISTA;

import MODELO.class4;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Propietario
 */
public class main4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Datos de entrada numeros, arrays, cantidad
        int cantidad;
        
        class4 modelo = new class4(); //Se crea una instancia
        
        //Soliticamos la cantidad de numeros
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros a ingrear en ambas listas: "));
        //Declaramos y inicializamos las listas de numeros
        int[] numerosA = new int[cantidad], 
                numerosB = new int[cantidad], 
                numerosC = new int[cantidad];
        
        //Bucle para
        for (int i = 0; i < cantidad; i++) {
            //Se solicitan los datos
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero " + (i+1) + " para la lista 'A': "));
            //Se almacena en la lista
            numerosA[i] = numero;

            //Se solicitan los datos            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero " + (i+1) + " para la lista 'B': "));
            //Se almacena en la lista            
            numerosB[i] = numero;
        }
        //Se llama al metodo y se envian los datos
        numerosC = modelo.sumarListas(numerosA, numerosB, numerosC);
        
         //Se imprimen los resultados
        JOptionPane.showMessageDialog(null,"LISTA A: " + Arrays.toString(numerosA) + "\n"
                + "LISTA B: " + Arrays.toString(numerosB) + "\n"
                        + "LISTA C: " + Arrays.toString(numerosC)); //Convertimos array a cadena de texto
        
    }
    
}
