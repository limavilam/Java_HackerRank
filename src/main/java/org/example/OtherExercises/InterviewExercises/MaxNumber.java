package org.example.OtherExercises.InterviewExercises;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        System.out.println("Calculadora de máximos:");

        for (int i = 0; i < numbers.length; i++) {
            int number;
            do {
                System.out.println("Ingrese el numero: ");
                number = scanner.nextInt();
                if (number < 0) {
                    System.out.println("El numero no puede ser negativo");
                }
            }while (number < 0);
            numbers[i] = number;
        }

        maxNumber(numbers);
    }

    public static int maxNumber(int[] number) {

        int max = number[0];
        for (int i = 1; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }
        System.out.println("El numero maximo es: " + max);
        return max;
    }

}
