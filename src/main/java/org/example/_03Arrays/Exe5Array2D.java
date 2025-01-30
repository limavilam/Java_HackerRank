package org.example._03Arrays;

/*
Create a 2D array of the specified size.
Return the filled 2D array
 */

import java.util.Scanner;

public class Exe5Array2D {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Arreglo de dos dimensiones");

        int filas;
        int columnas;
        do {
            System.out.println("Ingrese el tamaño del array (FILAS): ");
            filas = scanner.nextInt();
            System.out.println("Ingrese el tamaño del array (COLUMNAS): ");
            columnas = scanner.nextInt();
            if (filas <= 0 || columnas <= 0) {
                System.out.println("Error: Las dimensiones deben ser números positivos.");
            }
        } while (filas <= 0 || columnas <= 0);

        int[][] matrix = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor para el elemento [" + i + "][" + j + "]: ");
                int valor = scanner.nextInt(); // Leer el valor para cada elemento
                matrix[i][j] = valor; // Asignar el valor al elemento correcto
            }
        }
        // Imprimir la matriz (opcional)
        System.out.println("\nMatriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
