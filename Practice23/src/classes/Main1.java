package classes;

public class Main1 {

    public Main1(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println(new Subtract(new Multiply(new Const(2), new Variable("x")),
                                             new Const(3)).evaluate(x));
    }
}
