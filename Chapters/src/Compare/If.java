package Compare;

public class If {

    public static void main(String[] args) {

        int myInt = 5;
        if (myInt < 10) {
            System.out.println("Не верно");
        }
        else if (myInt < 20) {
            System.out.println("Да, верно");
        }
        else {
            System.out.println("Все остальное");
        }
    }
}
