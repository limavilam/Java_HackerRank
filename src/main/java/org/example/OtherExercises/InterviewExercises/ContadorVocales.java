package org.example.OtherExercises.InterviewExercises;

import java.util.ArrayList;
import java.util.List;

public class ContadorVocales {
    public static void main(String[] args) {

        char[] cadenaPrueba = {'a', 'o', 'u', 'w', 'f'};

        int resultado = contadorVocales(cadenaPrueba);
        System.out.println("Número de vocales en la cadena: " + resultado);
    }

    public static int contadorVocales(char[] cadena) {
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        int contador = 0;

        for (int i = 0; i < cadena.length; i++) {
            for (int j = 0; j < vocales.length; j++) {
                if (cadena[i] == vocales[j]) {
                    contador++;
                }
            }
        }
        return contador;
    }
}
