/*
5. Escriba un algoritmo que lea un vector de números enteros y determine el valor máximo y el valor
mínimo.
 */
package VISTA;

import MODELO.class5;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Propietario
 */
public class main5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Datos de entrada, numeros, cantidad de numeros
        int numero, cantidad;
        
        
        class5 modelo = new class5(); //Se crea una instancia
        
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros: "));
        //Declaramos una lista de numeros con el tamaño ingresado
        int[] numeros = new int[cantidad];
        
        //Bucle por la cantidad de numeros
        for (int i = 0; i < cantidad; i++) {
            //Bucle para ingresar solo datos enteros
            do {
                //Se solicita el dato
                numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero " + (i+1) + ": "));
            } while (numero < 1);
            //Se almacena en la lista
            numeros[i] = numero;
        }
        //Se llama al metodo y se envian los datos
        modelo.valorMenorMayor(numeros);
        
        //Se imprimen los resultados
        JOptionPane.showMessageDialog(null,"LISTA DE NUMEROS: " + Arrays.toString(numeros) + "\n"
                + "VALOR MAXIMO: " + modelo.mayor + "\n"
                        + "VALOR MINIMO: " + modelo.menor); //Convertimos array a cadena de texto
    }
    
}
