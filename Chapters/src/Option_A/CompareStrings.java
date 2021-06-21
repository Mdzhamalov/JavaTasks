package Option_A;

public class CompareStrings {

    public static void main(String[] args) {
        String s1, s2;
        s1 = "Test";
        s2 = s1;
        System.out.println("Compare strings is: " + (s1 == s2));

        s1 = s1 + " pro"; // Creating new object by adding new symbol
        s2 = new String(s1); // Creating new object by copy
        System.out.println("Compare strings is: " + (s1 == s2));
        System.out.println("Compare strings: " + s1.equals(s2));

    }
}
