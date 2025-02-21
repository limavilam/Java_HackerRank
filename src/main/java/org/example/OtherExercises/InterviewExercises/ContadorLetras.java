package org.example.OtherExercises.InterviewExercises;

public class ContadorLetras {
    public static void main(String[] args) {
        char[] cadenaPrueba = {'a', 'o', 'u', 'w', 'f', 'b', 'e'};

        int[] resultado = contarLetras(cadenaPrueba);
        System.out.println("Número de vocales en la cadena: " + resultado[0]);
        System.out.println("Número de consonantes en la cadena: " + resultado[1]);
    }

    public static int[] contarLetras(char[] cadena) {
        int contadorVocales = 0;
        int contadorConsonantes = 0;

        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        char[] consonantes = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n',
                'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};

        for (int i = 0; i < cadena.length; i++) {

            for (int j = 0; j < vocales.length; j++) {
                if (cadena[i] == vocales[j]) {
                    contadorVocales++;
                    break;
                }
            }


            for (int k = 0; k < consonantes.length; k++) {
                if (cadena[i] == consonantes[k]) {
                    contadorConsonantes++;
                    break;
                }
            }
        }
        return new int[]{contadorVocales, contadorConsonantes};
    }
}

