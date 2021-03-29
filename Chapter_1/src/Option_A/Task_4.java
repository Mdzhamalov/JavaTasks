package Option_A;

import java.util.Scanner;

// ввести пароль в командную строку и сравнить его с валидным паролем
public class Task_4 {
    public static void main(String[] args) {
        Scanner password = new Scanner(System.in);
        System.out.print("Input your password: ");

        String actual_password = password.next(); // read the value
        String valid_password = "1111";
        if (actual_password.equals(valid_password))
            System.out.println("The password is correct");
        else
            System.out.println("Wrong password");




    }

}
