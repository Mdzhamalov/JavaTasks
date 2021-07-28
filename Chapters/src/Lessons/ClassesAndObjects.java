package Lessons;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person boy = new Person();
        boy.setNameAndAge("John", 43);
        boy.speak();


        Person girl = new Person();
        girl.age = 23;
        girl.name = "Anna";

        int yearsBoy = boy.calculateYearsToRetirement();
        int yearsGirl = girl.calculateYearsToRetirement();
        System.out.println(yearsBoy + " years to retirement to boy");
        System.out.println(yearsGirl + " years to retirement to girl");


        System.out.println();
        if (boy.name == girl.name) {
            System.out.println("Names are the same");
        }
        else {
            System.out.println("Names are different");
        }
        if (boy.equals(girl)) {
            System.out.println("Objects are equals");
        }
        else {
            System.out.println("Objects aren't equal");
        }
    }
}


class Person {
    String name;
    int age;

    void speak(){
            System.out.println("My name is " + name + ", " + "I'm " + age + " years old!");
    }

    int calculateYearsToRetirement(){
        int years = 65 - age;
        return years;
    }

    void setNameAndAge(String username, int userage){
        name = username;
        age = userage;
    }
}