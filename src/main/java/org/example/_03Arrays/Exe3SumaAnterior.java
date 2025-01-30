package org.example._03Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exe3SumaAnterior {
    public static void main(String[] args) {
        /*
        Suma el anterior:
        Se garantiza que la longitud de la matriz dada sea 2 o más.
        Se garantiza que la matriz dada no es nula.
        El metodo devuelve una matriz de booleanos donde cada elemento
        es un resultado para el elemento correspondiente en la matriz dada.
        Los dos primeros elementos de la matriz booleana siempre son falsos.
         */
        Scanner scanner = new Scanner(System.in);

        int n;

        do{
            System.out.println("Ingrese el tamaño del array, este debe ser mayor o igual a 2:");
            n = scanner.nextInt();
            if(n<2) {
                System.out.println("Ingrese un número valido");
            }
        }while(n<2);

        int[] array = new int[n];
        for(int i = 0; i <array.length; i++){
            System.out.println("Ingrese los valores de la matriz:");
            array[i] = scanner.nextInt();
        }
        System.out.println("Los elementos de la matriz son:"+ Arrays.toString(array));

        //Crear y llenar la matriz booleana
        boolean[] resultado = new boolean[n];
        resultado[0] = false;
        resultado[1] = false;

        for (int i = 2; i < array.length; i++){
            if(array[i] == array[i-1] + array[i-2]){
                resultado[i] = true;
            }else{
                resultado[i] = false;
            }
        }

        System.out.println("La matriz booleana es: " + Arrays.toString(resultado));

    }
}
