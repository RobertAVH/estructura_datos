import java.util.Scanner;

public class Arreglos_02 {
    public static void main(String[] args) {
        // Declarar un arreglo
        int[] enteros;
        // Inicializamos
        enteros = new int[5];
        // Modificar los elementos
        enteros[0] = 13;
        enteros[1] = 21;
        enteros[4] = 62;
        
        for (int i = 0; i < enteros.length; i++) {
            System.out.println(enteros[i]);
        }
        
    }
}
