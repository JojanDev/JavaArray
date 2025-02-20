/*
12. Programar por medio de un Switch
    1. Mostrar los números que ingresaste en el arreglo
    2. Realiza las modificaciones para que muestre los números pares del arreglo
    3. Realiza las modificaciones para que muestre los números impares del arreglo
    4. Mostrar el número mayor del arreglo
    5. Mostrar el número menor del arreglo
    6. Buscar un número dentro del arreglo mostrarlo en caso de encontrarlo, así como su posición dentro del
    arreglo, en caso de no existir mandar un mensaje
    7. Salir del programa.
 */
package VISTA;
import MODELO.class12;
import javax.swing.JOptionPane;
/**
 *
 * @author Propietario
 */
public class main12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables de entrada, cantidad de numero
        int cantidad, numero, opcion;
        int[] arrayNumeros;
        class12 modelo = new class12(); //Se crea una instancia
        
        //Se solicita la cantidad de numeros
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros: "));
        //Se llama al metodo inicializar array
        arrayNumeros = modelo.inicializarArray(cantidad);
        
        //Bucle para pedir todos los numeros
        for (int i = 0; i < cantidad; i++) {
            //Se solicita el numero
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero " + (i+1) + ": "));
            //Se llama al metodo para agregar elementos a un array
            arrayNumeros = modelo.agregarArray(i, numero, arrayNumeros);
        }
        
        //Bucle
        do {
            //Solicitamos la opcion del menu
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                            MENU: 
                                                1. Mostrar los números que ingresaste en el arreglo
                                                2. Realiza las modificaciones para que muestre los números pares del arreglo
                                                3. Realiza las modificaciones para que muestre los números impares del arreglo
                                                4. Mostrar el número mayor del arreglo
                                                5. Mostrar el número menor del arreglo
                                                6. Buscar un número dentro del arreglo mostrarlo en caso de encontrarlo, así como su posición dentro del
                                                arreglo, en caso de no existir mandar un mensaje
                                                7. Salir del programa.
                                            """));
            //Se llama al metodo y se envian los datos
            modelo.Switch(opcion, arrayNumeros); //Maneja las opciones
        } while (opcion != 7); //Termina cuando ingrese 7(salir)
        
    }
    
}
