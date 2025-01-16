package org.example._02ConditionsLoops;

import java.util.Scanner;

public class MeetStrangersMejorado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Por favor ingrese un número de agentes (o -1 para salir): ");
                int numeroAgente = scanner.nextInt();

                if (numeroAgente == -1) {
                    System.out.println("Programa finalizado. ¡Adiós!");
                    break; // Termina el ciclo
                } else if (numeroAgente == 0) {
                    System.out.println("El número no puede ser 0. Inténtalo de nuevo.");
                } else if (numeroAgente < 0) {
                    System.out.println("El número no puede ser negativo. Inténtalo de nuevo.");
                } else {
                    scanner.nextLine(); // Consumir salto de línea sobrante
                    for (int i = 0; i < numeroAgente; i++) {
                        System.out.println("Ingrese el nombre del agente " + (i + 1) + ":");
                        String nombreAgente = scanner.nextLine();
                        System.out.println("Hola " + nombreAgente + "!");
                    }
                }
            } catch (Exception e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
                scanner.nextLine(); // Limpiar el buffer de entrada
            }
        }

        scanner.close(); // Cerrar el Scanner al final del programa
    }

}
