package org.example._03Arrays;

import java.util.Arrays;

public class EjemplosLectura {
    public static void main(String[] args) {
        //int[] numbers = {-9, 6, 0, -59};
        //System.out.println(numbers.length);

        int[] array; //Declarado pero no inicializado
        int[] amountDays = { 28,31,30,29};
        int[] arrayInt = new int[100];
        //System.out.println("April has " + amountDays[1] + " days");

        for (int i = 0; i < amountDays.length; i++) {
            if (amountDays[i] < 31) {
                amountDays[i] = 0;
            }
            arrayInt[i] = amountDays[i];
        }
        array = amountDays;

        //Si lo dejo así : System.out.println(array); imprime la ubicación en memoria.
        System.out.println(Arrays.toString(array));

        //Ejemplo de For-each
        int[] arrayInt2= { 1, 2, 3, 4, 5, 6 };
        for (int valueInt: arrayInt2) {
            System.out.println(valueInt);
        }

        int[]  arrayInt3 = { 10, 20, 30, 40, 50, 60 };
        for (int element : arrayInt3) {
            element *=  element;
            System.out.println(element); //si el print no existiera se copian solo los elementos
            //El element es una copia temporal
        }
        for (int valueInt2 : arrayInt3) {
            System.out.println(valueInt2);
        }

        //Ejemplo de matrices multidimensionales irregulares
        int[][] arr = new int [4][];
        arr[0] = new int [5];
        arr[1] = new int [4];
        arr[2] = new int [3];
        arr[3] = new int [2];
        System.out.println(Arrays.deepToString(arr));
    }
}
