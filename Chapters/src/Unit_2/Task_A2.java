package Unit_2;

// Ввести n строк с консоли.
// Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task_A2 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the number of strings: ");
        if (scan.hasNextInt()) {
            n = Integer.parseInt(scan.nextLine());
            List<String> text = new ArrayList<String>();
            for (int i = 0; i < n; i++) {
                text.add(scan.nextLine());
                text.sort(String::compareTo);
            }
            // Collections.sort(text);
            for (int i = 0; i < n; i++) {
                System.out.println("(" + text.get (i).length () + "): \"" + text.get (i) + "\"");
            }
        }

    }
}
