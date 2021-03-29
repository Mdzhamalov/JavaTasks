package Option_A;


import java.util.Scanner;

// Вывести целые числа как аргументы командной строки.
// Подсчитать их суммы (произведения).
// Вывести результаты на консоль
public class Task_5 {

    public static void main(String[] args) {

        Scanner numbers = new Scanner(System.in);
        System.out.print("Input numbers: ");

        int value = numbers.nextInt();
        int sum = 0;
        int com = 1;
        while (value != 0) {
            // Подсчет суммы чисел
            sum = sum + value % 10;
            value = value / 10;
        }
        System.out.println("Sum is: " + sum);

    }
}
