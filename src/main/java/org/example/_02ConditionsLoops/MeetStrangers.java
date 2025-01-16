package org.example._02ConditionsLoops;

import java.util.Scanner;

public class MeetStrangers {

    public static void main(String[] args) {
        //Programa de conocer los agentes cada vez que alguien introduzca su nombre
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Por favor ingrese un número: ");
            int numeroAgente = scanner.nextInt();
            if (numeroAgente == 0){
                System.out.println("El nombre no puede estar vacio");
            } else if (numeroAgente < 0) {
                System.out.println("El nombre no puede ser negativo");
            } else {
                //System.out.println("Ingrese nombre del agente"); //Si lo dejo afuera me va a repetir, ejemplo 2 o 3 veces el nombre del mismo agente así haya colocado nombres diferentes
                //String nombreAgente = scanner.next();
                for (int i = 0; i < numeroAgente; i++) {
                    System.out.println("Ingrese el nombre del agente " + (i + 1) + ":");
                    String nombreAgente = scanner.next();
                    System.out.println("Hola " + nombreAgente);
                }
            }
        }
    }
}
