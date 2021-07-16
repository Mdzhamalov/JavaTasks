package Lessons;

public class Encapsulation {

    public static void main(String[] args) {
        Users boy1 = new Users();
        boy1.setName("Tom");
        boy1.setAge(23);



    }
}



class Users{
    private String name;
    private int age;

    public void setName(String userName) {
        if (userName.isEmpty()){
            System.out.println("Type your name!");
        }
        else {
            name = userName;
        }
    }
    public String getName(){
        return name;
    }

    public void setAge(int userAge){
        if (userAge < 0) {
            System.out.println("Wrong age!");
        }
        else {
            age = userAge;
        }
    }
    public int getAge(){
        return age;
    }


    int calculateYearsToRetirement(){
        int years = 65 - age;
        return years;
    }

    void speak(){
        System.out.println("My name is " + name + ", I'm " + age + " years old!");
    }


}