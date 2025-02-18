/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author Propietario
 */
public class class5 {
    //Variables de salida se declaran publicas
    public int mayor = 0, menor = Integer.MAX_VALUE;
    
    //Metodo para hallar el valor menor y mayor
    public void valorMenorMayor(int[] lista){
        for (int i = 0; i < lista.length; i++) {
            if (mayor < lista[i]) {
                mayor = lista[i];
            }
            if (menor > lista[i]) {
                menor = lista[i];
            }
        }
    }
}
