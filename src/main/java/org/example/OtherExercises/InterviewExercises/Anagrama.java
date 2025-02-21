package org.example.OtherExercises.InterviewExercises;

import java.util.Arrays;

public class Anagrama {

    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";

        if (esAnagrama(a, b)) {
            System.out.println("Las palabras son anagramas.");
        } else {
            System.out.println("Las palabras NO son anagramas.");
        }
    }

    public static boolean esAnagrama(String s1, String s2) {
        // Si tienen diferente longitud, no pueden ser anagramas
        if (s1.length() != s2.length()) {
            return false;
        }

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // Convertir en array de caracteres y ordenar

        /*
        char[] arr1 = {'l', 'i', 's', 't', 'e', 'n'};
        char[] arr2 = {'s', 'i', 'l', 'e', 'n', 't'};

         */
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean comp = Arrays.equals(arr1, arr2);
        return comp;
    }

}
