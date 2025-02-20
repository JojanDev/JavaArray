/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author Propietario
 */
public class class11 {
    //Variables de salida se declaran publicas
    public int[] arrayC = null;
    
    
    //Metodo inicializar array
    public int[] inicializarArray(int tamaño){
        return new int[tamaño];
    }

    //Metodo para añadir un numero a un array
    public int[] agregarNumeros(int i, int numero, int[] array){
        array[i] = numero;
        return array;
    }
    
    public void compararArrays(int[] arrayA, int[] arrayB) {
        System.out.println("Elementos de A que no estan en B: ");
        boolean encontrado = false;

        for (int elementoA : arrayA) {
            boolean estaEnB = false;

            for (int elementoB : arrayB) {
                if (elementoA == elementoB) {
                    estaEnB = true;
                    break;
                }
            }

            if (!estaEnB) {
                System.out.println(elementoA);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Ninguno");
        }
    }
}
