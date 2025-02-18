/*
7. Cargar 2 vectores, uno con los códigos de los estudiantes que perdieron C#, el segundo con los
códigos de los estudiantes que perdieron Java. Se pide crear otro arreglo formado por los códigos
de los estudiantes que perdieron ambas materias. Mostrar el arreglo resultante.
 */
package MODELO;

/**
 *
 * @author Propietario
 */
public class class7 {
    //Variables de salida se declaran publicas
    public String[] java, cSharp, java_cSharp;
    
    //Se declara una variable como contador
    private int aux = 0;
    
    //Metodo para inicializar los arrays
    public void iniciarlizarArrays(int tamaño){
        java = new String[tamaño];
        cSharp = new String[tamaño];
    }
    
    //Metodo para agregar elementos a el vector Java
    public void agregarElementoJava(int posicion, String opcion){
        //Almacena segun la condicion
        if (opcion.equals("si")) {
            java[posicion] = "PERDIO";
        }else{
            java[posicion] = "GANO";
        }
    }
    
    //Metodo para agregar elementos a el vector cSharp
    public void agregarElementoCsharp(int posicion, String opcion){
        //Almacena segun la condicion
        if (opcion.equals("si")) {
            cSharp[posicion] = "PERDIO";
        }else{
            cSharp[posicion] = "GANO";
        }
    }
    
    //Metodo para agregar a una lista
    public void agregarElemento_AmbasMaterias(int tamaño, String[] estudiantes){
        //Contamos cuantos perdieron ambas materias
        for (int i = 0; i < tamaño; i++) {
            if (java[i].equals("PERDIO") && cSharp[i].equals("PERDIO")) {
                aux++;
            }
        }
        //Incializamos con el total que perdio ambas materias
        java_cSharp = new String[aux];
        
        //Bucle para alamcenar estudiantes que perdieron ambas materias
        for (int i = 0; i < java_cSharp.length; i++) {
            //Recorremos todos los estudiantes
            int aux = 0;
            while (aux < estudiantes.length){
                
            }
            for (int j = 0; j < estudiantes.length; j++) {
                //Condicion
                if (java[j].equals("PERDIO") && cSharp[j].equals("PERDIO")) {
                    java_cSharp[i] = estudiantes[j]; //Almacenamos el nombre
                } 
            }
        }
    }
}
