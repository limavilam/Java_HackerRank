package org.example.OtherExercises.InterviewExercises;

import java.util.Scanner;

import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduzca el segundo número: ");
        int num2 = scanner.nextInt();

        realizarOperaciones(num1, num2);

        scanner.close();
    }

    public static void realizarOperaciones(int num1, int num2) {
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = (num2 != 0) ? (double) num1 / num2 : Double.NaN;

        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicación es: " + multiplicacion);
        if (num2 != 0) {
            System.out.println("El resultado de la división es: " + division);
        } else {
            System.out.println("Error: División por cero.");
        }
    }
}
