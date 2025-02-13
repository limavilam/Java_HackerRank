package org.example.OtherExercises.InterviewExercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ConteoOcurrenciasHashMap1 {

    public static void main(String[] args) {
        int[] numeros = {2,5,7,8,9,13,11,12,8,9,5,2,2,7,7,7};
        System.out.println(Arrays.toString(numeros));
        System.out.println();

        Map<Integer,Integer> conteo = new HashMap<>();

        for (int i : numeros) {
            //Si ya esta ese número
            if (conteo.containsKey(i)) {
                //Obtenemos la llave y sumamos uno, nueva ocurrencia
                conteo.put(i, conteo.get(i) + 1);
            }else{
                conteo.put(i, 1);
            }
        }

        //Contenido de conteo
        for (Map.Entry<Integer,Integer> ocurrencia : conteo.entrySet()) {
            System.out.println("Ocurrencia: " + ocurrencia.getKey() + " = " + ocurrencia.getValue());
        }
    }
}
