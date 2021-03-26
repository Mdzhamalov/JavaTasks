package Option_A;
import java.util.Scanner;

// Отображение в консоли символов в обратном порядке
public class Task_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input the word: ");
        for (int i = 0; true; i++) { // condition is always true
            StringBuffer console = new StringBuffer(input.nextLine());
            console.reverse();
            System.out.println("Reversed: " + console.toString());
        }

    }

}
