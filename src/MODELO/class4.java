/*
4. Llenar dos vectores A y B de N elementos cada uno, sumar el elemento uno del vector A con el
elemento uno del vector B y así sucesivamente hasta N, almacenar el resultado en un vector C, e
imprimir los dos vectores y el vector resultante.
 */
package MODELO;

/**
 *
 * @author Propietario
 */
public class class4 {
    
    //Metodo para sumar elementos de listas
    public int[] sumarListas(int[] listaA,int[] listaB,int[] listaC){
        for (int i = 0; i < listaA.length; i++) {
            listaC[i] = listaA[i] + listaB[i]; //Almacenamos la suma en un vector
        }
        //Retornamos el vector
        return listaC;
    }
}
