package ud1;

public class variables {
    public static void main(String[] args) {
        //Interchanging variables a and b
        int a = 7;
        int b = 2;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + ", b = " + b);

    }
}