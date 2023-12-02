import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void task1() {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

    }

    public static void task4() {
        String str = "9+8-";
        Pattern p0 = Pattern.compile("\\d\\+");
        Pattern p1 = Pattern.compile("\\d \\+");
        Matcher m0 = p0.matcher(str);
        Matcher m1 = p1.matcher(str);
        if (m0.find() || m1.find()) System.out.println("bad");
        else System.out.println("good");

    }

    public static void task6() {
        String email = "lol@lol.ru";
        Pattern p = Pattern.compile("(\\w+)@(\\w+).(\\w+)");
        Matcher m = p.matcher(email);
        if (m.matches()) System.out.println("good");
        else System.out.println("bad");
    }

    public static void task7() {
        String password = "FDFKg_ffd5";

        Pattern p0 = Pattern.compile("(?=.*[@#$%])");
        Pattern p1 = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{8,}");
        Matcher m0 = p0.matcher(password);
        Matcher m1 = p1.matcher(password);

        if (!m0.find() && m1.find())
            System.out.println("good");
        else System.out.println("bad");
    }

    public static void main(String[] args) {
        task1();
        task4();
        task6();
        task7();
    }
}