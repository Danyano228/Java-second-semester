import classes.*;

public class Main {
    public static void main(String[] args) {
        String[] s = new String[]{"s1", "s2", "s3"};
        System.out.println(new NewClass().sToL(s));

        NewClass cl = new NewClass();
        cl.saveData(s);
        System.out.println(cl.getData(s));
    }
}