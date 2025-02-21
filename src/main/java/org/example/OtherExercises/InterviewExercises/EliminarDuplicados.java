package org.example.OtherExercises.InterviewExercises;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class EliminarDuplicados {
    public static void main(String[] args) {
        int[] entrada = {3, 4, 5, 5, 6, 7, 8, 9, 9, 9};

        int[] resultado = eliminarDuplicados(entrada);
        System.out.println(Arrays.toString(resultado));
    }

    public static int[] eliminarDuplicados(int[] array) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : array) {
            set.add(num); // Se eliminan duplicados automáticamente
        }

        // Convertimos el Set a array
        int[] resultado = new int[set.size()];
        int i = 0;
        for (int num : set) {
            resultado[i++] = num;
        }
        return resultado;
    }
}

