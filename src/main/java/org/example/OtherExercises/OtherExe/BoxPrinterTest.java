package org.example.OtherExercises.OtherExe;

class BoxPrinter<T> {
    private T val;
    public BoxPrinter(T arg) {
        val = arg;
    }
    public String toString() {
        return "[" + val + "]";
    }
}

public class BoxPrinterTest {
    public static void main(String[] args) {
        BoxPrinter<Integer> value1 = new BoxPrinter<>(new Integer(10));
        System.out.println(value1);
    }
}
