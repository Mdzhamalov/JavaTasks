package Option_A;

public class RunEncap {

    public static void main(String[] args) {
        EncapTest encap = new EncapTest();
        encap.setAge(-9);
        encap.setName("R");
        encap.setIdNum("001");

        System.out.println("ID: " + encap.getIdNum() + ", Age: " + encap.getAge() + ", Name: " + encap.getName());
    }

}
