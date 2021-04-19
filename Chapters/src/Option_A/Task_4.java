package Option_A;

import java.util.Scanner;

// Input password in command line
// Compare password with inputed value

public class Task_4 {

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            String valid_password = "1111";
            if (args[i].equals(valid_password))
                System.out.println("You entered correct password");
            else
                System.out.println("Wrong password. Try again");
        }


//        Scanner password = new Scanner(System.in);
//        System.out.print("Input your password: ");
//
//        String actual_password = password.next(); // read the value
//        String valid_password = "1111";
//
//        if (actual_password.equals(valid_password))
//            System.out.println("The password is correct");
//        else
//            System.out.println("Wrong password");
    }

}
