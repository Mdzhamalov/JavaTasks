package Option_A;
import java.io.*;

public class ReadCharRunner {

    public static void main(String[] args) {

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bis = new BufferedReader(is);
        try {
            System.out.println(
                    "Введите Ваше имя и нажмите <Enter>:");
            String name = bis.readLine();
            System.out.println("Привет, " + name);
        } catch (IOException e) {
            System.err.print("ошибка ввода " + e);
        }
    }
}
