package org.example._02ConditionsLoops;

import java.util.Scanner;

public class GoDutch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter total bill amount:");

        float totalBillAmount = scanner.nextFloat();

        if (totalBillAmount <= 0){
            System.out.println("Please enter a positive number:");
        }else{
            while (true){
                System.out.println("Please enter a friends number:");
                int numberFriends = scanner.nextInt();
                if (numberFriends <= 0){
                    System.out.println("No friends, please try again");
                }else{
                    float bill = (float) ((totalBillAmount * (0.1)) + totalBillAmount);
                    float totalAmount = bill / numberFriends;
                    System.out.println("Your bill amount is $" + bill
                    + " and your amount is $" + totalAmount);

                }
            }

        }
    scanner.close();

    }
}
