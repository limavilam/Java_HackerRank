package org.example.OtherExercises.InterviewExercises;

import java.util.Scanner;

public class Calculadora2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora en Java");
        System.out.println("Operaciones disponibles: +, -, *, /");

        System.out.print("Ingrese el primer número: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese la operación (+, -, *, /): ");
        char operacion = scanner.next().charAt(0);

        System.out.print("Ingrese el segundo número: ");
        double b = scanner.nextDouble();

        switch (operacion) {
            case '+':
                System.out.println("Resultado: " + suma(a, b));
                break;
            case '-':
                System.out.println("Resultado: " + resta(a, b));
                break;
            case '*':
                System.out.println("Resultado: " + multiplicacion(a, b));
                break;
            case '/':
                System.out.println("Resultado: " + division(a, b));
                break;
            default:
                System.out.println("Operación no válida");
        }
        scanner.close();
    }

    public static double suma(double a, double b) {
        return a + b;
    }

    public static double resta(double a, double b) {
        return a - b;
    }

    public static double multiplicacion(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: División por cero");
            return Double.NaN;
        }
    }
}

