package org.example.OtherExercises;

public class ExampleLambdas {

    interface TwoIntsToVoidFunction {
        void doCalc(int value1, int value2);
    }

    public static void main(String[] args) {
        TwoIntsToVoidFunction calc = (v1, v2) -> {
            v1++;
            int result = v1 * v2;
            System.out.println("The result is: " + result);
        };
        calc.doCalc(10, 5);
    }

    /*public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "cba", "test", "hello");
        Collections.sort(strings,  (String s1, String s2) -> {
            if (s1.length() < s2.length()) {
                System.out.println("Comparando " + s1 + " y " + s2 + ": Retornando -1");
                return -1;
            } else if (s1.length() > s2.length()) {
                System.out.println("Comparando " + s1 + " y " + s2 + ": Retornando 1");
                return 1;
            } else {
                System.out.println("Comparando " + s1 + " y " + s2 + ": Retornando 0");
                return 0;
            }
        } );
        System.out.println(strings);
    }*/

}
