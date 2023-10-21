import static java.lang.Math.pow;

public class MathFunc implements MathCalculable {

    @Override
    public double raiseToPower(double num, double power) {
        return pow(num, power);
    }

    @Override
    public double complexModule(double num, double i) {
        return pow(num*num + i*i, 0.5);
    }

    public double circumference(double r) {
        return 2 * PI * r;
    }
}
