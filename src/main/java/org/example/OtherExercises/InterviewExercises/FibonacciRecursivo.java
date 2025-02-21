package org.example.OtherExercises.InterviewExercises;

import java.util.Scanner;

public class FibonacciRecursivo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número para determinar el fibonacci:");
        int numero = scanner.nextInt();
        System.out.println(fibonacciRecursivo(numero));
    }

    public static int fibonacciRecursivo(int n) {
        if (n < 0) {
            System.out.println("El número no puede ser 0");
            return 0;
        }else if (n == 0) {
            return 0;
        }else if (n == 1) {
            return 1;
        }
        int recursividad = fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        System.out.println("El número " + n + " es " + recursividad);
        return recursividad;

    }
}
