package org.example._03Arrays;

public class ForEachExample {
    public static void main(String[] args) {
        /*
El siguiente ejercio le ayudará a entender cómo debe usar los bucles for y for-each.
Problema: Encuentre el valor máximo en la matriz y reemplace los elementos negativos
en esta matriz con este valor.
         */
        int[] array = { 5, 10, 0, -5, 16, -2 };
        int numberMax = array[0]; //asume que el primero es el mayor

        for (int value : array ){
            if (value > numberMax){
                numberMax = value;
                System.out.println("The number maximum is: " + value);

                /*
                Iteración 1: value=5, numberMax=5 (Falso)
                Iteración 2: value =10, numberMax=5 (Verdadera)
                Iteración 3: value = 0, numberMax=10 (Falso)
                Iteración 4: value = -5, numberMax=10 (Falso)
                Iteración 5: value = 16, numberMax=10 (Verdadero)
                Iteración 6: value = -2, numberMax=16 (Falso)
                 */
            }
        }

        for (int i = 0; i < array.length; i++){
            if(array[i] < 0){
                array[i] = numberMax;
                System.out.println("array[" + i + "]= "+ array[i]);
            }
        }
    }

}
