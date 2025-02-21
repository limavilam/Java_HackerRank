package org.example.OtherExercises.InterviewExercises;

public class ContadorConsonantes {
    public static void main(String[] args) {

        char[] cadenaPrueba = {'a', 'o', 'u', 'w', 'f'};

        int resultado = contadorConsonantes(cadenaPrueba);
        System.out.println("Número de consonantes en la cadena: " + resultado);
    }

    public static int contadorConsonantes(char[] cadena) {
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        int contador = 0;

        for (int i = 0; i < cadena.length; i++) {
            for (int j = 0; j < vocales.length; j++) {
                if (cadena[i] == vocales[j]) {
                    break;
                }
                if (j == vocales.length-1) {
                    contador++;
                }
            }
        }
        return contador;
    }
}
