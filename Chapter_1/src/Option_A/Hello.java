package Option_A;

import java.util.Scanner;

//Поприветствовать пользователя, используя командную строку
public class Hello {

    public static void main(String[] args) {


        Scanner name = new Scanner(System.in);
        System.out.print("Print name: ");

        String firstname = name.nextLine();  // read the value
        System.out.println("Hello, " + firstname);

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
