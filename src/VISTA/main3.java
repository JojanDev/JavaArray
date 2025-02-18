/*
3. Ingresar N números en un vector y al final mostrar cuantos números son negativos y cuantos son
cero, cuántos son positivos, el promedio de los negativos y la suma de los positivos.
 */
package VISTA;

import MODELO.class3;
import javax.swing.JOptionPane;

/**
 *
 * @author Propietario
 */
public class main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Datos de entrada, cantidad de numeros
        int cantidad;
        
        class3 modelo = new class3(); //Se crea una instancia
        
        //Se solicita la longitud del array
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros a ingresar: "));
        modelo.iniciarlizarArrays(cantidad);
        
        //Bucle
        for (int i = 0; i < cantidad; i++) {
            //Se solicitamos el dato
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero " + (i+1) + ": "));
            
            //Se llama al metodo y se envian los datos
            modelo.agregarDatos(numero, i);
            modelo.contar(i);
        }
        modelo.promediar();
        
        //Se imprimen los resultados
        JOptionPane.showMessageDialog(null, "TOTAL DE NUMEROS NEGATIVOS: " + modelo.totalNegativos);
        JOptionPane.showMessageDialog(null, "TOTAL DE CEROS: " + modelo.totalCeros);
        JOptionPane.showMessageDialog(null, "TOTAL DE NUMEROS POSITIVOS: " + modelo.totalPositivos);
        JOptionPane.showMessageDialog(null, "PROMEDIO DE NUMEROS NEGATIVOS: " + modelo.promedio);
        JOptionPane.showMessageDialog(null, "SUMA DE NUMEROS POSITIVOS: " + modelo.sumaPositivos);       
    }
    
}
