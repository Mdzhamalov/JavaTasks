package Lessons;

public class ThisAndConstructors {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Tommy");
        human1.setAge(23);
        human1.getInfo();

        Human human2 = new Human("Mario"); // second constructor
        Human human3 = new Human("Jack", 32); // third constructor


    }
}

class Human {

    private String name;
    private int age;

    public Human(){
        this.name = "Имя по умолчанию";
        this.age = 0;
    }
    public Human(String name){
        System.out.println("Hi from the second constructor");
        this.name = name;
    }
    public Human(String name, int age){
        System.out.println("Hi from the third constructor");
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void getInfo(){
        System.out.println(name + ", " + age);
    }



}
