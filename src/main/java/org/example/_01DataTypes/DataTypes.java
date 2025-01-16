package org.example._01DataTypes;

import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Debe ingresar el tiempo en segundos y dejarlo en formato h:mm:ss

        System.out.println("Por favor ingrese un número de segundos que quiera convertir en horas:");
        int segundos = scanner.nextInt();

        if (segundos < 0) {
            System.out.println("Ingrese un número valido");
        } else {
            String horas= String.format("%d:%02d:%02d", segundos / 3600, (segundos % 3600) / 60, segundos % 60);
            System.out.println(horas);
        }



    }
}
