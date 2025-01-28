package org.example._03Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exe2SumPares {
    public static void main(String[] args) {
        /*
        Suma de numeros pares, si la matriz es nula o vacia, el metodo devuelve cero,
        El metodo sum no debe modificar la matriz.
         */
        Scanner scanner = new Scanner(System.in);

        int [] array = new int[10];
        System.out.println("Ingresará los números para llenar el array");

        //Mi lógica podría decirme que primer el do-while y luego el for pero eso
        //generaría repetición del número introducido.

        for (int i = 0; i < array.length; i++) {
            int valor;
            do {
                System.out.println("Ingresar el valor: ");
                valor = scanner.nextInt();
                if (valor == 0){
                    System.out.println("El valor introducido no es valido");
                }else{
                    array[i] = valor;
                    System.out.println("El valor introducido es: " + array[i]);
                    }
            } while (valor < 0);
        }

        System.out.println("El arreglo es:" + Arrays.toString(array));

        int resultado = SumOfEvenNumber(array);
        System.out.println("La suma de los pares es: " + resultado);
    }

    public static int SumOfEvenNumber(int [] array){
        int sum = 0;

        for (int value: array) {
            if (value % 2 == 0) {
                sum += value;
            }
        }
        return sum;
    }
}
