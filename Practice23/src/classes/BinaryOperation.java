package classes;

abstract class BinaryOperation extends Expression {
    Expression left;
    Expression right;

    public BinaryOperation(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
