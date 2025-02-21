package org.example.OtherExercises.OtherExe;

import java.util.Scanner;

public class GoDutch {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        int billTotalAmount = scanner.nextInt();
        if (billTotalAmount < 0){
            System.out.println("Bill total amount cannot be negative");
            return;
        }

        int numberFriends = scanner.nextInt();
        if (numberFriends <= 0 ){
            System.out.println("Number of friends cannot be negative or zero");
            return;
        }

        int totalAmountWithTips = (int) Math.round(billTotalAmount * 1.1);
        int totalAmount = totalAmountWithTips/numberFriends;
        System.out.println(totalAmount);


    }
}
