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
        System.out.println("Enter array length: ");
        int n = input.nextInt();
        int[] InputedNumbers = new int[n];
        System.out.println("Insert array elements: ");

        int max = InputedNumbers[0];
        for (int i = 0; i < n; i++) {
            InputedNumbers[i] = input.nextInt();
            max = Math.max(max, InputedNumbers[i]);
        }
        System.out.println("Max number: " + max);

        // Display min number
        int min = Collections.min(Arrays.stream(InputedNumbers).boxed().collect(Collectors.toList()));
        System.out.println("Min number: " + min);

    }

}
