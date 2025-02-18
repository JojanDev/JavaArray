/*
3. Ingresar N números en un vector y al final mostrar cuantos números son negativos y cuantos son
cero, cuántos son positivos, el promedio de los negativos y la suma de los positivos.
 */
package MODELO;

/**
 *
 * @author Propietario
 */
public class class3 {
    //Variables de salida se declaran publicas
    public int totalNegativos = 0, totalPositivos = 0, totalCeros = 0, promedio, sumaPositivos = 0;
    
    public int[] numeros;
    private int sumaNegativos = 0;
    
    //Metodo para inicializar los arrays
    public void iniciarlizarArrays(int tamaño){
        numeros = new int[tamaño];
    }
    
    //Metodo para agregar los datos a una posicion del array
    public void agregarDatos(int numero, int posicion){
        numeros[posicion] = numero;
    }
    
    public void contar(int i){
        if (numeros[i] < 0) {
            totalNegativos++;
            sumaNegativos += numeros[i];
        }else if (numeros[i] > 0) {
            totalPositivos++;
            sumaPositivos += numeros[i];
        }else if (numeros[i] == 0){
            totalCeros++;
        }
    }
    
    public void promediar(){
        if (totalNegativos > 0) {
            promedio = sumaNegativos / totalNegativos;
        }
    }
}
