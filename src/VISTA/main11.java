/*
11. Programa que lea dos arreglos A y B y diga que elementos de A no están en B.

Resultado: Elementos del vector A que no están en el vector B son: 3 y 8
 */
package VISTA;
import MODELO.class11;
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
        
        //Bucle para pedir todos los numeros
        for (int i = 0; i < cantidad; i++) {
            //Se solicita el numero del prmer array
            int numeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero " + (i+1) + " para el arrayA: "));
            //Se llama al metodo y se envian los datos
            arrayA = modelo.agregarNumeros(i, numeros, arrayA);
            
            //Se solicita el numero del segundo array
            numeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero " + (i+1) + " para el arrayB: "));
            //Se llama al metodo y se envian los datos
            arrayB = modelo.agregarNumeros(i, numeros, arrayB);
        }
        //Se llama al metodo
        modelo.compararArrays(arrayA, arrayB);
    }
    
}
