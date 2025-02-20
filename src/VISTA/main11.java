/*
11. Programa que lea dos arreglos A y B y diga que elementos de A no están en B.

Resultado: Elementos del vector A que no están en el vector B son: 3 y 8
 */
package VISTA;
import MODELO.class11;
import java.util.Arrays;
import javax.swing.JOptionPane;
/**
 *
 * @author Propietario
 */
public class main11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Datos de entrada, cantidad de numeros
        int cantidad;
        
        class11 modelo = new class11(); //Se crea una instancia
        
        //Se solicita la cantidad de numeros
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros: "));
        
        //Se llama al metodo para inicializar los arrays
        int[] arrayA = modelo.inicializarArray(cantidad);
        int[] arrayB = modelo.inicializarArray(cantidad);        
        
        for (int i = 0; i < cantidad; i++) {
            int numeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero " + (i+1) + " para el arrayA: "));
            arrayA = modelo.agregarNumeros(i, numeros, arrayA);
            
            numeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero " + (i+1) + " para el arrayB: "));
            arrayB = modelo.agregarNumeros(i, numeros, arrayB);
        }
        
        modelo.compararArrays(arrayA, arrayB);
    }
    
}
