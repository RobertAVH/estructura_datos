public class Busqueda_binaria {
    // Búsqueda Binaria (Binary Search)
    // Requiere que el arreglo esté previamente ordenado. Busca dividiendo el rango a la mitad.
    public static int binarySearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == value) {
                return mid;
            } else if (array[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int valueToFind = 5;
        int result = binarySearch(array, valueToFind);
        if (result != -1) {
            System.out.println("Elemento encontrado en el índice: " + result);
        } else {
            System.out.println("Elemento no encontrado.");
        }
    }
}
