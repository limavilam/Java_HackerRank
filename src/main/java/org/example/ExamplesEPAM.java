package org.example;

import java.sql.SQLOutput;

public class ExamplesEPAM {
    public static void main(String args[]) {
        System.out.println("2 + 2 = " + (2 + 2));
        int[][] arr = new int[4][];
        arr[0] = new int[5];
        arr[1] = new int[4];
        arr[2] = new int[3];
        arr[3] = new int[2];

        System.out.println(arr);

        int[][] array2D = {{1, 2, 3, 4, 5},
                {5, 4, 3, 2, 1},
                {0, 2, 0, 4, 0}};
        System.out.println(array2D);

        int[][] c = new int[2][2];

// Inicializar el arreglo con algunos valores
        c[0][0] = 1;
        c[0][1] = 2;
        c[1][0] = 3;
        c[1][1] = 4;

// Imprimir el arreglo
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println(); // Salto de línea después de cada fila
        }

        int[] array2 = new int[3]; // Declaración e inicialización del arreglo

        array2[0] = 10; // Asignación de valores a las posiciones del arreglo
        array2[1] = 20;
        array2[2] = 30;

// Imprimir el valor en la posición 1 del arreglo (índice 1)
        System.out.println("Valor en la posición 1: " + array2[1]);



    }
}



