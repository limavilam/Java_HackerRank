package org.example.OtherExercises.InterviewExercises;

public class NumeroMedio {
    public static void main(String[] args) {

        int[] numerosMedio = {1,2,3,4,5};

        int tamano = numerosMedio.length;
        int medio = tamano / 2;

        // Accedemos al valor del elemento en el índice medio
        int valorMedio = numerosMedio[medio];

        System.out.println("El número medio es: " + valorMedio);

    }
}
