/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author Propietario
 */
public class class6 {
    //Declaramos una array
    
    //Metodo inicializar array
    public int[] inicializarArray(int tamaño){
        int[] array;
        return array = new int[tamaño];
    }
    
    //Metodo para añadir un numero a un array
    public int[] agregarNumeros(int i, int numero, int[] array){
        array[i] = numero;
        return array;
    }
    
    //Metodo para sumar arrays
    public int[] sumarArrays(int tamaño, int[] array1, int[] array2){
        //Declaramos un array para almacenar el resultado
        int[] arraySumas = new int[tamaño];
        //Bucle
        for (int i = 0; i < tamaño; i++) {
            //Añadimos el resultado
            arraySumas[i] = array1[i] + array2[i];
        }
        //Retornamos el array
        return arraySumas;
    }
    
    //Metodo para restar arrays
    public int[] restarArrays(int tamaño, int[] array1, int[] array2){
        //Declaramos un array para almacenar el resultado
        int[] arrayResta = new int[tamaño];
        //Bucle
        for (int i = 0; i < tamaño; i++) {
            //Añadimos el resultado
            arrayResta[i] = array1[i] - array2[i];
        }
        //Retornamos el array
        return arrayResta;
    }
}
