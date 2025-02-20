/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Propietario
 */
public class class12 {
    //Metodo para inicializar array
    public int[] inicializarArray(int tamaño){
        return new int[tamaño];
    }
    
    //Metodo para agregar elemento a un array
    public int[] agregarArray(int posicion, int numero, int[] array){
        array[posicion] = numero;
        return array;
    }
    
    //Metodo para ejecutar cada opcion
    public void Switch(int opcion, int[] array){
        //Switch para llamar a cada metodo segun la opcion
        switch (opcion) {
            case 1:
                //Se llama al metodo y se envia el argumento
                mostrarArray(array);
                break;
            case 2:
                //Se llama al metodo y se envia el argumento
                mostrarParesArray(array);
                break;
            case 3:
                //Se llama al metodo y se envia el argumento
                mostrarImparesArray(array);
                break;
            case 4:
                //Se llama al metodo y se envia el argumento
                mostrarMayorArray(array);
                break;    
            case 5:
                //Se llama al metodo y se envia el argumento
                mostrarMenorArray(array);
                break; 
            case 6:
                //Se llama al metodo y se envia el argumento
                buscarEnArray(array);
                break; 
            case 7:
                //Imprimimos si quiere finalizar el programa
                System.out.println("FINALIZO EL PROGRAMA!!!");
                break; 
            default:
                break;
        }
    }
    
    //Metodo para mostrar los elementos un array
    public void mostrarArray(int[] array){
        //Se imprime el array con un metodo para convertir arrays en cadena
        System.out.print("ELEMENTOS DEL ARRAY: " + Arrays.toString(array));
        System.out.println();
    }
    
    //Metodo para mostrar los numeros pares de un array
    public void mostrarParesArray(int[] array){
        System.out.print("ELEMENTOS PARES DEL ARRAY: ");
        //Bucle para iterar sobre el array
        for (int elemento : array) {
            //Condicional si es par
            if (elemento % 2 == 0) {
                //Imprimimos el elemento
                System.out.print("  " + elemento);
            }
        }
        System.out.println();
    }
    
    //Se define un metodo para mostrar los numeros impares de un array
    public void mostrarImparesArray(int[] array){
        System.out.print("ELEMENTOS PARES DEL ARRAY: ");
        //Bucle para recorrer el array
        for (int elemento : array) {
            //Condicional si es impar
            if (elemento % 2 != 0) {
                //Imprimimos el elemento
                System.out.print("  " + elemento);
            }
        }
        System.out.println();
    }
    
    //Metodo para mostrar el numero mayor de un array
    public void mostrarMayorArray(int[] array){
        System.out.print("EL NUMERO MAYOR DEL ARREGLO ES: ");
        //Se declara una variable que almacena el numero mayor
        int mayor = 0;
        //Bucle para recorrer el array
        for (int elemento : array) {
            //Condicional para hallar el numero mayor
            if (mayor < elemento) {
                //Asignamos el numero mayor a la variable
                mayor = elemento;
            }
        }
        System.out.println(mayor);
    }
    
    //Metodo para mostrar el numero menor de un array
    public void mostrarMenorArray(int[] array){
        System.out.print("EL NUMERO MENOR DEL ARREGLO ES: ");
        //Se declara una variable que almacena el numero menor
        int menor = Integer.MAX_VALUE; //Max_value para darle un valor maximo y asi tome el primer numero como menor
        for (int elemento : array) {
            //Condicional para hallar el numero menor
            if (menor > elemento) {
                //Asignamos el numero menor a la variable
                menor = elemento;
            }
        }
        System.out.println(menor);
    }
    
    //Metodo para buscar en un array
    public void buscarEnArray(int[] array){
        //Solicitamos el numero a buscar
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a buscar: "));
        //Se declara una variable booleana para verificar si existe el numero en el array
        boolean existe = false;
        
        //Bucle para recorrer el array
        for (int i = 0; i < array.length; i++) {
            //Condicional para hallar el igual
            if (numero == array[i]) {
                //Imprime un mensaje si existe en el array
                System.out.println("El numero existe en el arreglo y esta en la posicion " + i);
                
                existe = true; //Se asigna true porque el numero existe en el array
                break; //Rompemos el bucle si hallamos numero
            }
        }
        //Condicional si no existe el numero
        if (!existe) {
            //Imprime el mensaje
            System.out.println("El numero no se encuentra");
        }
    }
}
