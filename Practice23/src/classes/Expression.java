package classes;

abstract class Expression {
    abstract int evaluate(int x);
}

class Const extends Expression {
    private int value;

    public Const(int value) {
        this.value = value;
    }

    @Override
    int evaluate(int x) {
        return value;
    }
}

class Add extends BinaryOperation {
    public Add(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    int evaluate(int x) {
        return left.evaluate(x) + right.evaluate(x);
    }
}

class Divide extends BinaryOperation {
    public Divide(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    int evaluate(int x) {
        return left.evaluate(x) / right.evaluate(x);
    }
}

class Multiply extends BinaryOperation {
    public Multiply(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    int evaluate(int x) {
        return left.evaluate(x) * right.evaluate(x);
    }
}

class Subtract extends BinaryOperation {
    public Subtract(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    int evaluate(int x) {
        return left.evaluate(x) - right.evaluate(x);
    }
}







