package org.example._03Arrays;

/*
Desplaza todos los elementos del array dado 1 posición hacia la derecha.
En este caso, el último elemento del array pasa a ser el primero.
Se garantiza que el valor de desplazamiento no sea negativo ni mayor que la longitud de la matriz.
Por ejemplo, 1 3 2 7 4 con un desplazamiento de 3 se convierte en 2 7 4 1 3.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Exe4CycleSwap {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingreso de números");

        int [] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            int n;
            do{
                System.out.println("Ingrese el número positivo:");
                n = scanner.nextInt();
                if(n<0){
                    System.out.println("Ingrese nuevamente el número, no puede ser negativo:");
                }
            }while(n<0);
            array[i] = n;
        }
        System.out.println(Arrays.toString(array));

        System.out.println("Ingrese el desplazamiento");
        int desplaza= scanner.nextInt();
        if(desplaza<0){
            System.out.println("Ingrese nuevamente el desplazamiento");
        }else {
            giroArray(array, desplaza);
        }
    }

    public static void giroArray(int[] array, int desplazamiento) {

        int [] temp = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            int nuevaPosicion = (i+desplazamiento)%temp.length;
            temp[nuevaPosicion] = array[i];
        }
        System.out.println("Arreglo desplazado: " + Arrays.toString(temp));
    }

}
