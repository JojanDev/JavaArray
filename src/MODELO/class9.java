/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

import javax.swing.JOptionPane;

/**
 *
 * @author Propietario
 */
public class class9 {
    //Declaramos una array
    private int[]  array;
    
    //Metodo inicializar array
    public void inicializarArray(int tamaño){
        array = new int[tamaño];
    }
    
    //Metodo para añadir un numero a un array
    public void agregarNumeros(int i, int numero){
        array[i - 1] = numero;
    }
    
    //Metodo para devolver un array inverso
    public int[] invertirArray(){
        //Inicializamos el array inverso
        int[] arrayInverso = new int[20];
        
        //Bucle para añadir los elementos al nuevo array
        for (int i = 0; i < array.length; i++) {
           arrayInverso[i] = array[(array.length - 1) - i];
        }
        //Retornamos el nuevo array
        return arrayInverso;
    }
}
