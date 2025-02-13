package org.example.OtherExercises.InterviewExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContarOcurrenciasHashMap {
    /*
    Manipulación de cadenas.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca una cadena: ");
        String cadena = scanner.nextLine();

        contarPalabras(cadena);

    }

    public static Map <String, Integer> contarPalabras(String cadena) {

        //Map para almacenar el conteo
        Map <String, Integer> texto = new HashMap<>();
        cadena = cadena.toLowerCase().replaceAll("[.,!¡?]", "");
        String[] palabras = cadena.split(" ");

        //Contar palabras
        for (String palabra : palabras) {

            if (palabra.length() >= 2) {
                if (texto.containsKey(palabra)) {
                    texto.put(palabra, texto.get(palabra) + 1);
                }else {
                    texto.put(palabra, 1);
                }
            }
        }
        //Contenido de conteo
        for (Map.Entry<String,Integer> ocurrencia : texto.entrySet()) {
            System.out.println("Ocurrencia: " + ocurrencia.getKey() + " = " + ocurrencia.getValue());
        }
        return texto;
    }




}

