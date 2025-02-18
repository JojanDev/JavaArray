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
    //Metodo para restar elementos de listas
    public int[] restarListas(int[] listaA,int[] listaB,int[] listaC){
        for (int i = 0; i < listaA.length; i++) {
            listaC[i] = listaA[i] - listaB[i]; //Almacenamos la suma en un vector
        }
        //Retornamos el vector
        return listaC;
    }
}
