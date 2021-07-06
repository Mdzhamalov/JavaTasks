package Compare;

public class TestCompare {

    public static void main(String[] args) {

        Rectangle o1 = new Rectangle("Side1");

        Rectangle o2 = new Rectangle("Side1");

        Rectangle o3 = new Rectangle("Side3");

        if (o1 == o2) {
            System.out.println("o1 == o2");
        }
        else {
            System.out.println("Objects o1 and o2 aren't ==");
        }

        if (o1.equals(o2)) {
            System.out.println("o1 equals o2");
        }
        else {
            System.out.println("Objects o1 and o2 aren't equal");
        }

        if (o1.equals(o3)) {
            System.out.println("o1 equals o3");
        }
        else {
            System.out.println("Objects o1 and o3 aren't equal");
        }


    }

}
