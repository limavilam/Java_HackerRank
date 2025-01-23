package org.example._03Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exe1MaxMethod {
    /*
    Debo determinar el valor máximo en un array.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arrayNumber = new int[6];

        System.out.println("Ingrese números no negativos");
        for (int i = 0; i < arrayNumber.length; i++) {
            int number;
            do {
                System.out.println("Ingrese el numero: ");
                number = scanner.nextInt();
                if (number < 0) {
                    System.out.println("El numero no puede ser negativo");
                }
            }while (number < 0);
            arrayNumber[i] = number;
        }

        //Encontrar el número más grande
        int max = arrayNumber[0];
        for (int num : arrayNumber) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("El número máximo es:" + max);
        System.out.println(Arrays.toString(arrayNumber));

    }
}
