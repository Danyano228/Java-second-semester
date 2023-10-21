public class MovableRectangle implements Movable {

    public MovableRectangle(double x1, double x2, double y1, double y2, double xSpeed, double ySpeed) {
        topLeft.setX(x1);
        topLeft.setY(y1);
        topLeft.setxSpeed(xSpeed);
        topLeft.setySpeed(ySpeed);
        bottomRight.setX(x2);
        bottomRight.setY(y2);
        bottomRight.setxSpeed(xSpeed);
        bottomRight.setySpeed(ySpeed);
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

    public void speedTest() {
        if (topLeft.xSpeed == bottomRight.xSpeed &
                topLeft.ySpeed == bottomRight.ySpeed) {
            System.out.println("Speeds are equal");
        } else System.out.println("Speeds aren't equal");
    }
}
