/*
9. Almacenar 20 números en un vector, almacenarlos en otro vector en orden inverso al vector
original e imprimir el vector resultante.
 */
package VISTA;

import MODELO.class9;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Propietario
 */
public class main9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables de entrada, numeros
        int numero;
        
        class9 modelo = new class9(); //Se crea una instancia
        
        //Llamamos al metodo inicializar arreglo
        modelo.inicializarArray(20);
        
        //Bucle para solicitar 20 numeros
        for (int i = 1; i <= 20; i++) {
            //Se solicita el dato
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero " + i + ": "));
            modelo.agregarNumeros(i, numero); //Se almacena en el array
        }
        //Llamamos al metodo que invierte el array
        int[] arrayInverso = modelo.invertirArray();
        
        //Se imprimen los resultados
        JOptionPane.showMessageDialog(null, "Array en orden inverso: " + Arrays.toString(arrayInverso));
    }
}
