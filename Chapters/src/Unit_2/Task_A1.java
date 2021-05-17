package Unit_2;

// Ввести из консоли n строк. Найти самую короткую и самую длинную строки.
// Вывести эти строки и их длинну

import java.util.Scanner;

public class Task_A1 {

    public static void main(String[] args) {

        System.out.println("Input the number of strings: ");
        int n; // the number of strings
        String[] text;
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            n = Integer.parseInt(scan.nextLine());
            int indexMax = 0;
            int indexMin = 0;
            text = new String[n]; //массив строк

            for (int i = 0; i < n; i++) {
                text[i] = scan.nextLine();
                if (text[i].length() <= text[indexMin].length())
                    indexMin = i;
                if (text[i].length() >= text[indexMax].length())
                    indexMax = i;

            }
            System.out.printf("MIN (%d): \"%s\"%n", text[indexMin].length (), text[indexMin]);
            System.out.printf("MAX (%d): \"%s\"%n", text[indexMax].length (), text[indexMax]);
        }

    }
}
