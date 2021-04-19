package Option_B;

// Ввести из консоли n целых чисел и поместить их в массив
// На консоль вывести наибольшее и наименьшее число

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task_B_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = 6;
        System.out.println("Введите " + n + " целых чисел через пробел: ");

        int[] InputedNumbers = new int[n];

        int max = InputedNumbers[0];
        for (int i = 0; i < n; i++) {
            InputedNumbers[i] = input.nextInt();
            max = Math.max(max, InputedNumbers[i]);
        }
        System.out.println("Максимальное число: " + max);

        // Вывод наименьшего числа
        int min = Collections.min(Arrays.stream(InputedNumbers).boxed().collect(Collectors.toList()));
        System.out.println("Минимальное число: " + min);

    }
}
