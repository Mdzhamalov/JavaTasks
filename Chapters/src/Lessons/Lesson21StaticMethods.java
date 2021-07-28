package Lessons;

public class Lesson21StaticMethods {
    public static void main(String[] args) {
        HumanS h1 = new HumanS("Tomas", 24);
        HumanS h2 = new HumanS("Billy", 26);
        HumanS h3 = new HumanS("Ann", 31);
        h1.PrintNumberOfPeople();
        h2.PrintNumberOfPeople();
    }

}

class HumanS {
    private String name;
    private int age;
    private static int countPeople;

    public HumanS(String name, int age){
        this.name = name;
        this.age = age;
        countPeople = countPeople + 1;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void PrintNumberOfPeople(){
        System.out.println("Number of People: " + countPeople);
    }

}