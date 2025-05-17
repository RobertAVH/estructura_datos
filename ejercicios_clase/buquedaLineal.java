public class buquedaLineal {
    public static void main(String[] args) {
        // Sintaxis Simplificada
        int[] enteros = { 1, 2, 3, 4, 6, 8, 19, 22, 25, 29 };
        int comparar = 8;
        // Iterar los elementos de arreglo
        for (int indice = 0; indice < enteros.length; indice++) {
            if (comparar == enteros[indice]) {
                System.out.println("Numero " + comparar + " esta en la posicion: " + indice);
                break;
            }
        }
    }
}
