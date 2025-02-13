package org.example.OtherExercises.InterviewExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PreciosLista {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el precio de la fruta que quiere validar: ");
        Double valor = scanner.nextDouble();

        Map<String, Double> listaPrecios = new HashMap<>();
        listaPrecios.put("Manzana", 1.2);
        listaPrecios.put("Pera", 1.5);
        listaPrecios.put("Banana", 0.8);
        listaPrecios.put("Uva", 2.0);

        filtrarPrecios(listaPrecios, valor);


    }

    public static Map<String, Double> filtrarPrecios(Map<String, Double> listaPrecios, Double valor) {
        Map<String, Double> preciosFiltrados = new HashMap<>();

        for (Map.Entry<String, Double> entry : listaPrecios.entrySet()) {
            if (entry.getValue()>valor) {
                preciosFiltrados.put(entry.getKey(), entry.getValue());
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

        return preciosFiltrados;

    }
}