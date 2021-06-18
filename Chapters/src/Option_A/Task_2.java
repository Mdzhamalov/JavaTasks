package Option_A;
import java.util.Scanner;

// Display the arguments of command line in reverse order

public class Task_2 {

    public static void main(String[] args) {

        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println(args[i]);
        }




//        Scanner input = new Scanner(System.in);
//        System.out.print("Input the word: ");
//
//        for (int i = 0; true; i++) { // condition is always true
//            StringBuffer console = new StringBuffer(input.nextLine());
//            console.reverse();
//            System.out.println("Reversed: " + console.toString());
        }

    }
