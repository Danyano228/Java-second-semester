public class TestBall {
    double x_speed, y_speed;
    int ticks = 10;
    Ball ball;
    public TestBall(Ball ball, double x, double y, double x_speed, double y_speed) {
        this.ball = ball;
        this.ball.x = x;
        this.ball.y = y;
        this.x_speed = x_speed;
        this.y_speed = y_speed;
    }

    public void toTest() {
        System.out.println("\nBall's coordinates:");
        double x_now, y_now;
        x_now = ball.getX();
        y_now = ball.getY();
        System.out.printf("%f; %f\n", x_now, y_now);
        for (int i = 0; i < ticks; i++) {
            this.ball.move(x_speed, y_speed);
            x_now = ball.getX();
            y_now = ball.getY();
            System.out.printf("%f; %f\n", x_now, y_now);
        }
        System.out.println(ball.toString());
    }

}
