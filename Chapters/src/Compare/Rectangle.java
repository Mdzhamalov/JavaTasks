package Compare;


import java.util.Objects;

public class Rectangle {

    private String side1;

    public Rectangle(String side1) {
            this.side1 = side1;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(side1, rectangle.side1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(side1);
    }
}
