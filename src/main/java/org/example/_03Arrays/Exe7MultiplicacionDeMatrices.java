package org.example._03Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Exe7MultiplicacionDeMatrices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int [][] matriz1 = new int[2][3];
        int [][] matriz2 = new int[3][2];
        int [][] matrizResultante = new int[2][2];

        // Entrada de la matriz 1
        System.out.println("Ingrese los números de la matriz 1:");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = random.nextInt(5);
                System.out.println(matriz1[i][j] + " ");
            }
        }

        // Entrada de la matriz 2
        System.out.println("Ingrese los números de la matriz 2:");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = random.nextInt(5);
                System.out.println(matriz2[i][j] + " ");
            }
        }

        //Multiplicación de matrices
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                matrizResultante[i][j] = 0;
                for (int k = 0; k < matriz2[i].length; k++) {
                    matrizResultante[i][j] += matriz1[i][k] * matriz2[k][j];
                }

            }
        }

        // Imprimir la matriz resultante
        System.out.println("Matriz resultante:");
        for (int i = 0; i < matrizResultante.length; i++) {
            for (int j = 0; j < matrizResultante[i].length; j++) {
                System.out.print("|" + matrizResultante[i][j] + "|");
            }
            System.out.println();
        }

    }
}
