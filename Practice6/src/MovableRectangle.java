public class MovableRectangle implements Movable {
    private MovablePoint topLeft;

    private MovablePoint bottomRight;

    public MovableRectangle(double x1, double x2, double y1, double y2, double xSpeed, double ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);

        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                ", x1=" + topLeft.x +
                ", y1=" + topLeft.y +
                ", x1=" + bottomRight.x +
                ", y2=" + bottomRight.y +
                ", xSpeed=" + topLeft.xSpeed +
                ", ySpeed=" + topLeft.ySpeed +
                '}';
    }

    @Override
    public void moveUp() {
        topLeft.y += topLeft.ySpeed;
        bottomRight.y += bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        topLeft.y -= topLeft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    }

    @Override
    public void moveLeft() {
        topLeft.x -= topLeft.xSpeed;
        bottomRight.x -= bottomRight.xSpeed;
    }

    @Override
    public void moveRight() {
        topLeft.x += topLeft.xSpeed;
        bottomRight.x += bottomRight.xSpeed;
    }

    public void checkSpeedPoints() {
        if (topLeft.xSpeed == bottomRight.xSpeed &
                topLeft.ySpeed == bottomRight.ySpeed) {
            System.out.println("Speeds are equal");
        } else System.out.println("Speeds aren't equal");
    }
}
