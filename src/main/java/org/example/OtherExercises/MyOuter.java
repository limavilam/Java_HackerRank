package org.example.OtherExercises;

/*public class MyOuter {

    private int x = 7;
    public void makeInner(){
        MyInner in = new MyInner();
        in.seeOuter();
    }

    class MyInner{
        private int x = 8;
        public void seeOuter(){
            System.out.println("X is" + x);
        }
    }

    public static void main(String[] args){
        MyInner inner = new MyOuter().new MyInner();
        inner.seeOuter();
    }
}*/

/*public class MyOuter {
    private String x = "Outer";

    void doStuff() {
        class MyInner {
            MyInner mi = new MyInner();
            mi.seeOuter();
            public void seeOuter() {
                System.out.println("Outer x is " + x);
            }
        }
    }

    public static void main(String[] args) {
        MyOuter myOuter = new MyOuter();
        myOuter.doStuff();
    }
}*/
