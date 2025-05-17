public class Ordenamiento {
    // Ordenamiento Burbuja (Bubble Sort)
    // Este algoritmo compara elementos adyacentes y los intercambia si están en el orden incorrecto.
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Intercambio de elementos
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Ordenamiento Shell (Shell Sort)
    // Es una mejora del ordenamiento por inserción, que compara elementos separados por un gap.
    public static void shellSort(int[] array) {
        int n = array.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = temp;
            }
        }
    }

    // Ordenamiento Rápido (Quick Sort)
    // Algoritmo de ordenamiento basado en el método "divide y vencerás".
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    // Función auxiliar para la partición del arreglo
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Arreglo original: " + java.util.Arrays.toString(array)+"\n\n");

        // Ordenamiento Burbuja
        bubbleSort(array);
        System.out.println("Ordenamiento Burbuja: " + java.util.Arrays.toString(array));

        // Reiniciar el arreglo para el siguiente ordenamiento
        array = new int[]{64, 34, 25, 12, 22, 11, 90};

        // Ordenamiento Shell
        shellSort(array);
        System.out.println("Ordenamiento Shell: " + java.util.Arrays.toString(array));

        // Reiniciar el arreglo para el siguiente ordenamiento
        array = new int[]{64, 34, 25, 12, 22, 11, 90};

        // Ordenamiento Rápido
        quickSort(array, 0, array.length - 1);
        System.out.println("Ordenamiento Rápido: " + java.util.Arrays.toString(array));
    }
}

