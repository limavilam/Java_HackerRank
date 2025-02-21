package org.example.OtherExercises.InterviewExercises;

import java.util.HashMap;
import java.util.Map;

public class OcurrenciaPalabrasExe3 {
    public static void main(String[] args) {

        String frase = "Pepito Grillo";


        contarLetras(frase);

    }
    public static Map<String, Integer> contarLetras(String frase) {

        //Creo un mapa para almacenar el conteo
        Map<String,Integer> textos = new HashMap<>();
        //Creo un arreglo con la cadena partida letra por letra o palabra por palabra.


        //2. Letra
        //String[] palabras = frase.toLowerCase().split(" ");

        String[] letras = frase.toLowerCase().split("");
        for (String letra : letras) {
            System.out.println(letra);
            if (textos.containsKey(letra)) {
                textos.put(letra, textos.get(letra) + 1);
            }else{
                textos.put(letra, 1);
            }
        }

        //1. Palabra
        //String[] palabras = frase.toLowerCase().split(" ");

        //Empiezo a recorrer a través del for each pero palabras
        /*
        for (String palabra: palabras){
            if (textos.containsKey(palabra)){
                textos.put(palabra,textos.get(palabra)+1);
            }else{
                textos.put(palabra,1);
            }
        }

         */

        //Contenido de conteo
        for (Map.Entry<String,Integer> ocurrencia : textos.entrySet()) {
            System.out.println("Ocurrencia: " + ocurrencia.getKey() + " = " + ocurrencia.getValue());
        }


        return Map.of();
    }



}
