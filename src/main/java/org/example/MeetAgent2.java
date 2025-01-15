package org.example;

import java.util.Scanner;

public class MeetAgent2 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
/* First part
        int contrasena = 123456;

        System.out.print("Ingrese la contraseña:");
        int contrasenaIngresada = scanner.nextInt();

        if (contrasenaIngresada == contrasena) {
            System.out.print("Hello agent");
        } else {
            System.out.print("Acceso Denegado");
        }
    }
}
*/
        int contrasena = 123456;
        int intentos = 10; //Si hubiera intentos ilimitados sería While (true)

        //No se debe dejar la solicitud de contraseña fuera porque no volvería a pedir el número, así que el bucle se tornaría infinito.

        while (intentos > 0) {

            System.out.print("Ingrese la contraseña: \t");
            int contrasenaIngresada = scanner.nextInt();

            if (contrasenaIngresada == contrasena) {
                System.out.print("Ingreso exitoso -- Hola agente");
                break;
            } else {
                System.out.print("Acceso Denegado, intentos restantes: " + (intentos-1) + "\t");
            }
            intentos--;

            System.out.print("Número de intentos actuales: " + intentos + "\t");
        }

    }
}