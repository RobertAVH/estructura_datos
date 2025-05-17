public class Busqueda_lineal {

    // Búsqueda Lineal (Linear Search)
    // Recorre el arreglo de manera secuencial buscando un valor.
    public static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {34, 7, 23, 32, 5, 62};
        int valueToFind = 23;
        int index = linearSearch(data, valueToFind);
        if (index != -1) {
            System.out.println("Elemento encontrado en el índice: " + index);
        } else {
            System.out.println("Elemento no encontrado.");
        }
    }
}