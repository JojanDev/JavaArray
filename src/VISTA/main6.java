/*
6. Escriba un algoritmo que efectúe la suma y la resta de dos vectores de números reales.
 */
package VISTA;

import MODELO.class6;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Propietario
 */
public class main6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Datos de entrada, cantidad
        int cantidad;
        int[] array1, array2;
        
        class6 modelo =  new class6(); //Se crea una instancia
        
        //Solicitamos la cantidad 
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numero a ingresar: "));
        
        //Inicilizamos el array
        array1 = modelo.inicializarArray(cantidad);
        array2 = modelo.inicializarArray(cantidad);        
        
        //Bucle para ingresar todos los numeros
        for (int i = 0; i < cantidad; i++) {
            //Solicitamos el numero
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero " + (i+1)+ " del primer vector"));
            //Se llama al metodo para añadir el elemento al array
            array1 = modelo.agregarNumeros(i, numero, array1);
            
            //Solicitamos el numero
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero " + (i+1)+ " del segundo vector"));
            //Se llama al metodo para añadir el elemento al array
            array2 = modelo.agregarNumeros(i, numero, array2);
        }
        
        //Se llama al metodo y se envian los datos
        int[] arraySumas = modelo.sumarArrays(cantidad, array1, array2);
        int[] arrayRestas = modelo.restarArrays(cantidad, array1, array2);        
        
        //Se imprimen los resultados
        JOptionPane.showMessageDialog(null, "ARRAY 1: " + Arrays.toString(array1) + "\n"
                + "ARRAY 2: " + Arrays.toString(array2) + "\n"
                + "SUMA DE LOS ARRAYS: " + Arrays.toString(arraySumas) + "\n"
                + "RESTA DE LOS ARRAYS: " + Arrays.toString(arrayRestas));
    }
}
