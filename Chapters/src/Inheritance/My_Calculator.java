package Inheritance;

class Calculator {

    int c;

    public void addition (int a, int b) {
        c = a + b;
        System.out.println("Summ is: " + c);
    }

    public void substraction(int a, int b) {
        c = a - b;
        System.out.println("Subtraction is: " + c);
    }
}

public class My_Calculator extends Calculator {

    public void multiplication(int a, int b) {
        c = a * b;
        System.out.println("Multiplication is: " + c);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        My_Calculator act = new My_Calculator();
        act.addition(a, b);
        act.substraction(a, b);
        act.multiplication(a, b);
    }


}
