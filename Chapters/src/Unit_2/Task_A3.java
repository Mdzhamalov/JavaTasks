package Unit_2;

// Ввести N строк. Вывести те строки, длина которых меньше средней.

import java.util.Scanner;

public class Task_A3 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the number of strings: ");
        if (scan.hasNextInt()) {
            n = Integer.parseInt(scan.nextLine());
            int average = 0;
            String[] text = new String[n];
            for (int i = 0; i < n; i++) {
                text[i] = scan.nextLine();
                average = average + text[i].length();
            }
            average = average / n;
            System.out.println("AVERAGE is: " + average);
            for (int i = 0; i < n; i++) {
                if (text[i].length() < average)
                    System.out.println("(" + text[i].length() + "): " + text[i]);
            }
        }
    }
}
