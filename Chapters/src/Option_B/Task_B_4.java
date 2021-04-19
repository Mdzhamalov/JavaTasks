package Option_B;

// Ввести из консоли n целых чисел и поместить их в массив
// На консоль вывести числа, которые деляться на 5 и на 7

import java.util.Scanner;

public class Task_B_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = 6;
        System.out.print("Введите " + n + " целых чисел через пробел: ");

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
            if ((numbers[i] % 5 == 0) && (numbers[i] % 7 == 0))
                System.out.println("делится на 5 и на 7:  " + numbers[i]);
        }

    }
}
