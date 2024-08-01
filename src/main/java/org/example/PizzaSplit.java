package org.example;

import java.util.Scanner;

public class PizzaSplit {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        int numberPeople = scanner.nextInt();
        int numberPiecesPizza = scanner.nextInt();

        //Para asegurarme que son enteros positivos
        int numberOfPizzas = 1;

        while (numberOfPizzas * numberPiecesPizza % numberPeople != 0) {
            numberOfPizzas++;
        }

        System.out.println(numberOfPizzas);

    }
}
