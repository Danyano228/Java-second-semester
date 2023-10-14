public class Circle extends Shape{
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String getShape() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return 3.14 * r * r;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * r;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
