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
    
    //Metodo para comparar arrays
    public void compararArrays(int[] arrayA, int[] arrayB) {
        System.out.println("Elementos de A que no estan en B: ");
        //Variable booleana para validar si no esta en el array
        boolean encontrado = false;
        
        //Bucle 
        for (int elementoA : arrayA) {
            //Variable para validar si el elementoA esta en el arrayB
            boolean estaEnB = false;
            //Bucle
            for (int elementoB : arrayB) {
                //Condicional si el elemento esta en el array
                if (elementoA == elementoB) {
                    //Como el elemento esta en B se cambia a true
                    estaEnB = true;
                    //Rompemos el ciclo al encontrar un numero igual
                    break;
                }
            }
            
            //Si no esta en el arrayB
            if (!estaEnB) {
                //Imprimir el elemento
                System.out.println(elementoA);
                //Como encontro elementos diferentes se cambia a true
                encontrado = true;
            }
        }
        
        //Condicion si no encuentra diferencias
        if (!encontrado) {
            //Imprime el resultado
            System.out.println("Ninguno");
        }
    }
}
