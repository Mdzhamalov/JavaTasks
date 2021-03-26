package A;

import java.util.Scanner;
import java.io.IOException;

public class Hello {

// Task 1. Поприветствовать пользователя, используя командную строку
    public static void main(String[] args) {


        Scanner name = new Scanner(System.in);
        System.out.println("Print name: ");

        String firstname = name.nextLine();
        System.out.println("Hello " + firstname);

//        System.out.println("Enter name: ");
//        try {
//            char name = (char) System.in.read();
//            System.out.println("Hello " + name);
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}
