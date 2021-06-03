package Unit_2;

import java.util.Scanner;

public class Task_A13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input parameters a, b and c: ");
        double a = input.nextInt();
        double b = input.nextInt();
        double c = input.nextInt();
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0)
            System.out.println("No solutions");
        else if (discriminant == 0) {
            double x = ((- b / (2 * a)));
            System.out.println("Only one solution: " + x);
        }
        else if (discriminant > 0) {
            double x1 = ((- b - Math.sqrt(b * b - 4 * a * c))/(2 * a));
            double x2 = ((- b + Math.sqrt(b * b - 4 * a * c))/(2 * a));
            System.out.println("There is two solutions: " + x1 + ", " + x2);
        }


    }
}
