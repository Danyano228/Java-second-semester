public class MovableCircle implements Movable {
    private double radius;
    private MovablePoint center;

    public MovableCircle(double x, double y, double xSpeed, double ySpeed, double radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + center.x +
                ", y=" + center.y +
                ", xSpeed=" + center.xSpeed +
                ", ySpeed=" +center.ySpeed +
                ", radius=" + radius +
                '}';
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.y -= center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x -= center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x += center.xSpeed;
    }
}
