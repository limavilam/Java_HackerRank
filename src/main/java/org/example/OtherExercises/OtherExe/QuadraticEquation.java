package org.example.OtherExercises.OtherExe;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0){
            double root1 = (- b + Math.sqrt(discriminante))/(2*a);
            double root2 = ( b + Math.sqrt(discriminante))/(2*a);
            System.out.println(root1+" "+root2);
        }else if (discriminante == 0){
            double root = -b/(2*a);

        }else{
            System.out.println("no roots");
        }
    }
}
