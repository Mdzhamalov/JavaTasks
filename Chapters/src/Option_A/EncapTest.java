package Option_A;

public class EncapTest {

    private int age;
    private String name;
    private String idNum;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setAge(int newAge) {
        if (newAge < 0) {
            System.out.println("Incorrect age");
        }
        else {
            age = newAge;
        }
    }

    public void setName(String newName) {
        if (newName.isEmpty()){
            System.out.println("There is empty name");
        }
        else {name = newName;}
    }

    public void setIdNum(String newId) {
        idNum = newId;
    }

}
