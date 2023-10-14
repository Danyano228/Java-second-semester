public class Shape {

    public String getShape() {
        return "Figure";
    }
    public double getArea() {
        return 1;
    }

    public double getPerimeter() {
        return 1;
    }

    public String toString() {
        return String.format ("\n%s\nArea: %.3f\nPerimeter: %.3f",
                getShape(), getArea(), getPerimeter());
    }
}
