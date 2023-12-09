import classes.*;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        String s = "s";
        double d = 0.00001;
        NewClass cl = new NewClass(i, s, d);
        System.out.println(cl.getT());
        System.out.println(cl.getV());
        System.out.println(cl.getK());
        cl.printTypes();
    }
}