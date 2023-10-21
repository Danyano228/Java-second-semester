public class Main {
    public static void main(String[] args) {

        MovableRectangle rectangle = new MovableRectangle(0.0, 0.5, 0.0, 0.5, 0.5,0.5);
        System.out.println(rectangle.toString());
        rectangle.moveUp();
        System.out.println(rectangle.toString());
        rectangle.speedTest();

        MathFunc math = new MathFunc();
        System.out.println(math.complexModul(3.0, 0.5));
        System.out.println(math.circumference(9.0));
    }
}