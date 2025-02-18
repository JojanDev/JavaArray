/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author Propietario
 */
public class class1 {
    //Variable de salida se declara publica
    public float promedio = 0;
    
    //Metodo para hallar el promedio de la lista de numeros
    public void promediar(int[] numeros){
        //Bucle para calcular la suma de todos los numeros
        for (int i = 0; i < numeros.length; i++) {
            promedio += numeros[i];
        }
        //Dividimos por el total de numeros;
        promedio /= numeros.length;
    }
    
}
