package Option_A;

import java.util.Date;
import java.util.Scanner;

// Вывести: фамилию разработчика +
// дату и время получения задания +
// дату и время сдачи задания +
public class Task_6 {
    public static void main(String[] args) {

        // Input last name
        Scanner last_name = new Scanner(System.in);
        System.out.print("Print your last name: ");
        String input = last_name.next();
        System.out.println("Last name is: " + input);

        // Start date
        Date getDateOfStartTask = new Date();
        getDateOfStartTask.getDate();
        System.out.println("Begin date is: " + getDateOfStartTask);

        // Finish date
        Date getDateOfFinishTask = new Date();
        long time = getDateOfFinishTask.getTime();
        time = time + (1000*60*60*72); // + 3 days
        getDateOfFinishTask = new Date(time);
        System.out.println("Finish date is: " + getDateOfFinishTask);


    }
}
