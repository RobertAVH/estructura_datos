import java.util.Arrays;

public class Vectores {
    public static void main(String[] args) {
        //Ejercicios con Arreglos Unidimensionales
        //1. Suma de elementos
        //Crear un arreglo de enteros y calcular la suma de todos sus elementos.
        int[] numeros = {5, 10, 15, 20, 25};
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        System.out.println("La suma es: " + suma);


        //2. Encontrar el máximo y mínimo
        //Dado un arreglo, encontrar el valor máximo y mínimo.
        int[] valores = {34, 12, 67, 3, 89, 5};
        int max = valores[0];
        int min = valores[0];
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > max) max = valores[i];
            if (valores[i] < min) min = valores[i];
        }
        System.out.println("Máximo: " + max + ", Mínimo: " + min);

        //3. Invertir un arreglo
        //Tomar un arreglo y devolverlo en orden inverso.
        int[] original = {1, 2, 3, 4, 5};
        int[] invertido = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            invertido[i] = original[original.length - 1 - i];
        }
        System.out.println(Arrays.toString(invertido));

        //4. Buscar un elemento
        //Verificar si un número dado está presente en el arreglo.
        int[] datos = {10, 20, 30, 40, 50};
        int buscado = 30;
        boolean encontrado = false;
        for (int dato : datos) {
            if (dato == buscado) {
                encontrado = true;
                break;
            }
        }
        System.out.println("¿Está el número " + buscado + "? " + encontrado);

        //Ejercicios con Matrices Bidimensionales
        //5. Suma de filas y columnas
        //Dada una matriz, calcular la suma de cada fila y cada columna.
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Suma de filas
        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Suma fila " + i + ": " + sumaFila);
        }

        // Suma de columnas
        for (int j = 0; j < matriz[0].length; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("Suma columna " + j + ": " + sumaColumna);
        }
        // //6. Matriz transpuesta
        // //Generar la matriz transpuesta (intercambiar filas por columnas).
        // int[][] original = {
        //     {1, 2, 3},
        //     {4, 5, 6}
        // };
        // int filas = original.length;
        // int columnas = original[0].length;
        // int[][] transpuesta = new int[columnas][filas];

        // for (int i = 0; i < filas; i++) {
        //     for (int j = 0; j < columnas; j++) {
        //         transpuesta[j][i] = original[i][j];
        //     }
        // }

        // // Mostrar transpuesta
        // for (int[] fila : transpuesta) {
        //     System.out.println(Arrays.toString(fila));
        // }
        // //7. Diagonal principal y secundaria
        // //Dada una matriz cuadrada, imprimir sus diagonales principal y secundaria.
        // int[][] matriz = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        //     {7, 8, 9}
        // };

        // System.out.print("Diagonal principal: ");
        // for (int i = 0; i < matriz.length; i++) {
        //     System.out.print(matriz[i][i] + " ");
        // }

        // System.out.print("\nDiagonal secundaria: ");
        // for (int i = 0; i < matriz.length; i++) {
        //     System.out.print(matriz[i][matriz.length - 1 - i] + " ");
        // }
        // //8. Buscar en matriz
        // //Verificar si un número dado está presente en la matriz.
        // int[][] matriz = {
        //     {10, 20, 30},
        //     {40, 50, 60},
        //     {70, 80, 90}
        // };
        // int buscado = 50;
        // boolean existe = false;

        // for (int[] fila : matriz) {
        //     for (int valor : fila) {
        //         if (valor == buscado) {
        //             existe = true;
        //             break;
        //         }
        //     }
        //     if (existe) break;
        // }

        // System.out.println("¿Está " + buscado + " en la matriz? " + existe);
        
        // //Ejercicio de Desafío (Opcional)
        // //9. Rotar matriz 90°
        // //Dada una matriz cuadrada, rotarla 90 grados en sentido horario.
        // int[][] matriz = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        //     {7, 8, 9}
        // };
        // int n = matriz.length;
        // int[][] rotada = new int[n][n];

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         rotada[j][n - 1 - i] = matriz[i][j];
        //     }
        // }

        // // Mostrar matriz rotada
        // for (int[] fila : rotada) {
        //     System.out.println(Arrays.toString(fila));
        // }


    }
}