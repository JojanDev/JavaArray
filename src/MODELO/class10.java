/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author Propietario
 */
public class class10 {
    //Variables de salida se declaran publicas
    public long[] serie;
    
    //Metodo para hallar los x numeros de la serie de fibonacci
    public void serieFibonacci(int cantidad){
        //Inicializamos el array
        serie = new long[cantidad];
        serie[0] = 0; //Añadimos valores para el funcionamiento
        serie[1] = 1;
        //Bucle
        for (int i = 2; i < cantidad; i++) {
            //Añadimos al array la operacion
            serie[i] = serie[i - 1] + serie[i - 2];
        }
    }
}
