import static java.lang.Math.pow;

public class Main {

    public static void main(String[] args) {
        System.out.println("4)");
        four(3, 12);

        int n = 100;
        System.out.println("\n5)\n" + fourFunc(n, 0));

        System.out.println("\n6)");
        n = 167;
        System.out.println(six(n, 2));

        System.out.println("\n8)");
        if (eight("poloiolop")) System.out.println("YES");
        else System.out.println("NO");
    }

    public static void four(int k, int d) {
        int s = 0;
        int a = (int) pow(10, k - 1);
        int b = (int) pow(10, k) - 1;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        for (; a <= b; a++) {
            if (fourFunc(a, 0) == d) s++;
        }
        System.out.println(s);
    }

    public static int fourFunc(int a, int s) {
        s += a % 10;
        a = a / 10;
        if (a == 0) return s;
        return fourFunc(a, s);
    }

    public static boolean six(int n, int div) {
        if (div > n / 2) return true;
        if (n % div == 0.0) return false;
        return six(n, div + 1);
    }

    public static boolean eight(String s) {
        if (s.length() <= 1) return true;
        String beginning = s.substring(0, 1);
        String ending = s.substring(s.length() - 1);
        String middle = s.substring(1, s.length() - 1);
        return (beginning.equals(ending)) && eight(middle);
    }
}
