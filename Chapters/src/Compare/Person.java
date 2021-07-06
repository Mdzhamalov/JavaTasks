package Compare;

import java.util.Objects;

public class Person {
    private double height;
    private double weight;

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Double.compare(person.height, height) == 0 && Double.compare(person.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, weight);
    }

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setHeight(1.8);
        person1.setWeight(80);

        Person person2 = new Person();
        person2.setHeight(1.8);
        person2.setWeight(80);

        Person person3 = new Person();
        person3.setHeight(1.95);
        person3.setWeight(90);

        System.out.println("Is person1 == person2 ? // " + (person1 == person2));
        System.out.println("Is person1 equals person2 ? // " + (person1.equals(person2)));

        System.out.println("Is person1 == person3 ? // " + (person1 == person3));
        System.out.println("Is person1 equals person3 ? // " + (person1.equals(person3)));


    }
}
