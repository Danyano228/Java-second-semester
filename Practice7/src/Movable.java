public interface Movable {

    public MovablePoint topLeft = new MovablePoint();

    public MovablePoint bottomRight = new MovablePoint();

    public void moveUp();

    public void moveDown();

    public void moveLeft();

    public void moveRight();
}
