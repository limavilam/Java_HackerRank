package org.example.OtherExercises;

import java.util.Scanner;

public class PiramideAsteriscos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de pisos:");
        int pisos = scanner.nextInt();

        piramideAsteriscos(pisos);
    }

    public static void piramideAsteriscos(int pisos) {
        for (int i = 0; i < pisos; i++) {
            int espacios = pisos - i - 1;
            int asteriscos = 1 + i * 2;
            for (int j = 0; j < espacios; j++) {
                System.out.println(" ");
            }
            for (int k = 0; k < asteriscos; k++) {
                System.out.print("*");
            }
        }
    }
}
