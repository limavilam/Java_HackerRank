package org.example.OtherExercises.OtherExe;

import java.util.Scanner;

public class MeetAnAgent {

    final static int PASSWORD = 133976;

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        if(number == PASSWORD){
            System.out.println("Hello, Agent");
        }else{
            System.out.println("Access denied");
        }


    }
}
