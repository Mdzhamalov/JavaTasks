package Unit_2;

// Ввести из консоли n строк. Найти самую короткую и самую длинную строки.
// Вывести эти строки и их длинну

import java.util.Scanner;

public class Task_A1 {

    public static void main(String[] args) {

        int n; // number of strings
        String[] text;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the number of strings: ");
        if (scan.hasNextInt()) {
            n = Integer.parseInt(scan.nextLine());
            int indexMax = 0;
            int indexMin = 0;
            text = new String[n]; // array of strings

            for (int i = 0; i < n; i++) {
                text[i] = scan.nextLine();
                if (text[i].length() <= text[indexMin].length())
                    indexMin = i;
                if (text[i].length() >= text[indexMax].length())
                    indexMax = i;

            }
            System.out.println("MIN (" + text[indexMin].length() + "), " + text[indexMin]);
            System.out.println("MAX is (" + text[indexMax].length() + "), " + text[indexMax]);
        }

    }
}
