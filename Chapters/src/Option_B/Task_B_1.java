package Option_B;

import java.util.Scanner;

// Ввести из консоли n целых чисел и поместить их в массив
// На консоль вывести четные и нечетные числа
public class Task_B_1 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt(); // read the array and write them to size
        int[] Numbers = new int[size];
        System.out.println("Insert array elements: ");


        for (int i = 0; i < size; i++) {
            Numbers[i] = input.nextInt();
            if (Numbers[i] % 2 == 0)
                System.out.println("Even number: " + Numbers[i]);
            else if (Numbers[i] % 2 != 0)
                System.out.println("Uneven number: " + Numbers[i]);
        }

    }
}
