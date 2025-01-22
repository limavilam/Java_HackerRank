package org.example._03Arrays;

import java.util.Arrays;

public class BidimensionalArray {
    public static void main(String[] args) {

        /*
        Problema: Encuentra la suma de los elementos de una matriz bidimensional.
         */
        int[][] array2D = { { 1, 2, 3, 4, 5 },
                { 5, 4, 3, 2, 1 },
                { 0, 2, 0, 4, 0 } };
        //System.out.println(Arrays.deepToString(array2D));
        int sum = 0;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                sum += array2D[i][j];
            }
        }
        System.out.println("Sum: " + sum);

        //Otra manera de hacerlo.

        int sumSecond = 0;
        for (int[]row : array2D) {
            for (int value : row) {
                sumSecond = sumSecond + value;
            }
        }
        for (int[] row : array2D) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println("sum = " + sum);

        /*
            Primera iteración del bucle exterior (row = {1, 2, 3, 4, 5}):
            Primera iteración del bucle interior (value = 1): sum = 0 + 1 = 1
            Segunda iteración del bucle interior (value = 2): sum = 1 + 2 = 3
            Tercera iteración del bucle interior (value = 3): sum = 3 + 3 = 6
            Cuarta iteración del bucle interior (value = 4): sum = 6 + 4 = 10
            Quinta iteración del bucle interior (value = 5): sum = 10 + 5 = 15
            Segunda iteración del bucle exterior (row = {5, 4, 3, 2, 1}):
            Primera iteración del bucle interior (value = 5): sum = 15 + 5 = 20
            Segunda iteración del bucle interior (value = 4): sum = 20 + 4 = 24
            Tercera iteración del bucle interior (value = 3): sum = 24 + 3 = 27
            Cuarta iteración del bucle interior (value = 2): sum = 27 + 2 = 29
            Quinta iteración del bucle interior (value = 1): sum = 29 + 1 = 30
            Tercera iteración del bucle exterior (row = {0, 2, 0, 4, 0}):
            Primera iteración del bucle interior (value = 0): sum = 30 + 0 = 30
            Segunda iteración del bucle interior (value = 2): sum = 30 + 2 = 32
            Tercera iteración del bucle interior (value = 0): sum = 32 + 0 = 32
            Cuarta iteración del bucle interior (value = 4): sum = 32 + 4 = 36
            Quinta iteración del bucle interior (value = 0): sum = 36 + 0 = 36
         */



    }
}
