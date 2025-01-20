package org.example._02ConditionsLoops;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxValue = Integer.MIN_VALUE;
        System.out.println("the number " + maxValue);

        System.out.println("Enter a number: ");
        int numberA;

        do{
            numberA = scanner.nextInt(); //Ojo no necesito volver a colcoarle int numberA;

            if(numberA > maxValue){
                maxValue = numberA;
                System.out.println("The maximum value is " + maxValue);
            }

        } while (numberA != 0);

    }
}

