public class Tester {
    public void test() {
        Shape circ = new Circle(10);
        System.out.println(circ.toString());

        Shape rec = new Rectangle(5, 10);
        System.out.println(rec.toString());

        Shape sq = new Square(10);
        System.out.println(sq.toString());
    }
}
