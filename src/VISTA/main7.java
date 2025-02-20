/*
7. Cargar 2 vectores, uno con los códigos de los estudiantes que perdieron C#, el segundo con los
códigos de los estudiantes que perdieron Java. Se pide crear otro arreglo formado por los códigos
de los estudiantes que perdieron ambas materias. Mostrar el arreglo resultante.
 */
package VISTA;

import MODELO.class7;
import javax.swing.JOptionPane;

/**
 *
 * @author Propietario
 */
public class main7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Datos de entrada, cantidad de estudiantes
        int cantidad;
        
        class7 modelo = new class7(); //Se crea una instancia
        
        //Se solicita la cantidad de estudiantes
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA CANTIDAD DE ESTUDIANTES: "));
        
        //Se llama al metodo y se envian los datos
        modelo.iniciarlizarArrays(cantidad);
        
        //Declaramos y incializamos listas para estudiantes 
        String[] estudiantes = new String[cantidad];
        
        //Bucle para la cantidad de estudiates
        for (int i = 0; i < cantidad; i++) {
            //Se solicitan los datos
            String nombre = JOptionPane.showInputDialog("INGRESE EL NOMBRE DEL ESTUDIANTE " + (i+1) + ": ");
            estudiantes[i] = nombre; //Se almacena en la lista
            
            String materia = JOptionPane.showInputDialog("ESTUDIANTE " + nombre + " PERDIO LA MATERIA JAVA?: ");
            //Se llama al metodo y se envian los datos
            modelo.agregarElementoJava(i, materia);
            
            materia = JOptionPane.showInputDialog("ESTUDIANTE " + nombre + " PERDIO LA MATERIA C#?: ");
            //Se llama al metodo y se envian los datos
            modelo.agregarElementoCsharp(i, materia);
        }
        
        //Se llama al metodo y se envian los datos
        modelo.agregarElemento_AmbasMaterias(cantidad, estudiantes);
        
        //Se imprimen los resultados
        System.out.println("ESTUDIANTES");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println( (i+1) + ". " + estudiantes[i] + " | JAVA: " + modelo.java[i] + " | C#: " + modelo.cSharp[i]);
        }
        System.out.println("ESTUDIANTES QUE PERDIERON AMBAS MATERIAS: ");
        for (int i = 0; i < modelo.java_cSharp.length; i++) {
            System.out.println(modelo.java_cSharp[i]);
        }
    }
}
