package Polymorphism;

public class Dog extends Animal{

    public void bark() {
        System.out.println("Dog is burking");
    }
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
}
