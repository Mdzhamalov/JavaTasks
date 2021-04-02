package Option_B;

import java.util.Scanner;

// Ввести из консоли n целых чисел и поместить их в массив
// На консоль вывести четные и нечетные числа
public class Task_B_1 {

    public static void main(String[] args) {

        // System.out.println("Введите желаемое количество целых чисел в массиве: ");
        Scanner input = new Scanner(System.in);
        // int size = input.nextInt();
        int size = 5;
        System.out.println("Введите " + size + " целых чисел через пробел: ");
        int[] Numbers = new int[size];


        for (int i = 0; i < size; i++) {
            Numbers[i] = input.nextInt();
            if (Numbers[i] % 2 == 0)
                System.out.println("Чётное число: " + Numbers[i]);
            else if (Numbers[i] % 2 != 0)
                System.out.println("Нечётное число: " + Numbers[i]);
        }

    }
}
