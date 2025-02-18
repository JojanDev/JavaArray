/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author Propietario
 */
public class class2 {
    //Variables de salida se declaran publicas
    public String[] nombres;
    public int[] longitud;
    
    //Metodo para inicializar los arrays
    public void iniciarlizarArrays(int tamaño){
        nombres = new String[tamaño];
        longitud = new int[tamaño];
    }
    
    //Metodo para agregar los datos a una posicion del array
    public void agregarDatos(String nombre, int posicion){
        nombres[posicion] = nombre;
    }
    
    //Metodo para almacenar la longitud de la cadena en un array
    public void longitudCadena(String nombre, int posicion){
        longitud[posicion] = nombre.length();
    }
}
