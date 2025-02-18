/*
2. Crea dos arrays o arreglos unidimensionales que tengan el mismo tamaño (lo pedirá por teclado),
en uno de ellos almacenaras nombres de personas como cadenas, en el otro array o arreglo ira
almacenando la longitud de los nombres, para ello puedes usar la función LONGITUD (cadena) que
viene en Plein. Muestra por pantalla el nombre y la longitud que tiene.
 */
package VISTA;

import MODELO.class2;
import javax.swing.JOptionPane;

/**
 *
 * @author Propietario
 */
public class main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Datos de entrada, tamaño array
        int tamaño;

        class2 modelo = new class2(); //Se crea una instancia
        
        //Se solicita el dato
        tamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la lista: "));
        //Se llama al metodo para iniciarlizar los arrays
        modelo.iniciarlizarArrays(tamaño);
        
        //Bucle para pedir los datos
        for (int i = 0; i < tamaño; i++) {
            
            //Se solicita el nombre
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre " + (i+1) + ": ");
            
            //Se llaman a los metodos y envian los datos
            modelo.agregarDatos(nombre, i);
            modelo.longitudCadena(nombre, i);
        }
        
        //Se imprimen los resultados
        for (int i = 0; i < tamaño; i++) {
            JOptionPane.showMessageDialog(null, "LA LONGITUD DEL NOMBRE: '" + modelo.nombres[i] + "' ES: '" + modelo.longitud[i] + "' LETRAS");
        }
    }
    
}
