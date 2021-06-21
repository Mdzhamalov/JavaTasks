package Option_A;

public class RunEncap {

    public static void main(String[] args) {
        EncapTest encap = new EncapTest();
        encap.setAge(23);
        encap.setName("Dony");
        encap.setIdNum("001");

        System.out.println("ID: " + encap.getIdNum() + ", Age: " + encap.getAge() + ", Name: " + encap.getName());
    }

}
