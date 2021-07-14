package Polymorphism;


public class test {

    public static void main(String[] args) {

        // Animal animal1 = new Dog();
        // animal1.eat();

        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        test(animal);
        test(dog);
        test(cat);
    }

    public static void test(Animal animal) {
        animal.eat();

    }
}
