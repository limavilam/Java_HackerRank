package org.example._03Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exe6MatrixTransposition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[3][3];
        System.out.println("Ingrese los números de la matriz:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        //Imprimir la matriz
        for (int[] visual:matrix){
            for (int valor: visual){
                System.out.print("|" + valor + "|");
            }
            System.out.println();

        }

        System.out.println("La matriz transpuesta es:");
        int [][] resultado = transpose(matrix);

    }

    public static int[][] transpose(int[][] matrixOriginal) {

        int filas = matrixOriginal.length;
        int columnas = matrixOriginal[0].length;
        int [][] transpuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matrixOriginal[i][j];
            }

        }
        //Imprimir la matriz
        for (int[] visual:transpuesta){
            for (int valor: visual){
                System.out.print("|" + valor + "|");
            }
            System.out.println();

        }

        return transpuesta;
    }
}
