package Inheritance;

public class SuperClass {

    public static void main(String[] args) {

        // Наследуем методы
        Doc dog = new Doc();
        dog.eat();
        dog.sleep();
        dog.bark();
        dog.DocsName("Tommy");
    }
}
