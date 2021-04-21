package Option_A;


import java.util.Scanner;

// Вывести целые числа как аргументы командной строки.
// Подсчитать их суммы (произведения).
// Вывести результаты на консоль
public class Task_5 {

    public static void main(String[] args) {
        int sum = 0;
        int mult = 1;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.valueOf(args[i]);
            mult *= Integer.valueOf(args[i]);
        }
        System.out.println("Sum is: " + sum);
        System.out.println("Multiplication is: " + mult);

//        Scanner numbers = new Scanner(System.in);
//        System.out.println("Input numbers: ");
//
//        for (int i = 0; true; i++) {
//            int a = numbers.nextInt();
//            int b = numbers.nextInt();
//
//            System.out.println("Sum is: " + (a + b));
//            System.out.println("Multiplication is: " + (a * b));
//        }

    }
}
