public class Main {
    public static void main(String[] args) {
        System.out.println("1)");
        MovableCircle circle = new MovableCircle(50, 50,
                                                 3, 4,
                                                 10);
        System.out.println(circle.toString());

        System.out.println("\n2)");
        MovableRectangle rectangle = new MovableRectangle(10, 40,
                                                          30, 10,
                                                          5, 6);
        System.out.println(rectangle.toString());

        rectangle.checkSpeedPoints();

        System.out.println("\n6, 7, 9)");
        Printable[] arr = {new Book(), new Magazine()};
        for (int i = 0; i < 2; i++) {
            arr[i].print();
        }
    }
}