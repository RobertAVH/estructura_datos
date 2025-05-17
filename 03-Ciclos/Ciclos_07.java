import java.util.Scanner;

public class Ciclos_07 {
    public static void main(String[] args) {
       // Menu interactivo
        System.out.println("*** Sistema de Administracion de Cuentas");
        var salir = false;
        while(!salir){
            System.out.print("Menu:\n" +
                    "1. Crear cuenta\n" +
                    "2. Eliminar cuenta\n" +
                    "3. Salir del Sistema\n" +
                    "Escoge una opcion:");
            var opcion = Integer.parseInt(new Scanner(System.in).nextLine());
            switch(opcion){
                case 1 : System.out.println("Creando tu cuenta...");
                case 2 : System.out.println("Eliminado tu cuenta...");
                case 3 : {
                    System.out.println("Saliendo del sistema. Hasta pronto...");
                    salir = true;
                }
                default : System.out.println("Opcion invalida: " + opcion);
            }
            System.out.println();
        }
    }
}
