package Option_B;

// Ввести из консоли n целых чисел и поместить их в массив
// На консоль вывести числа, которые деляться на 3 или на 9

import java.util.Scanner;

public class Task_B_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = 5;
        System.out.print("Введите " + n + " целых чисел через пробел:");

        int[] InputedNumbers = new int[n];

        for (int i = 0; i < n; i++) {
            InputedNumbers[i] = input.nextInt();
            if ((InputedNumbers[i] % 3 == 0) || (InputedNumbers[i] % 9 == 0))
                System.out.println("Делится на 3 или на 9: " + InputedNumbers[i]);
        }

    }
}
