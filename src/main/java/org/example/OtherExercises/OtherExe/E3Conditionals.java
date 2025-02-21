package org.example.OtherExercises.OtherExe;

import java.util.Scanner;

public class E3Conditionals {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        if (N % 2 == 1) {
            System.out.println("Weird");
        } else {
            if (2 <= N && N <= 5) {
                System.out.println("Not Weird");
            } else if (6 <= N && N <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }

        /*if (N % 2 == 0){
            if (N>= 2  && N<=5){
                System.out.println("Not Weird");
            }
             else if (N>= 6 && N<=20){
                System.out.println("Weird");
            }
            else if (N>20){
                System.out.println("Not weird");
            }
        }else{
            System.out.println("Weird");
        }*/
    }
}
