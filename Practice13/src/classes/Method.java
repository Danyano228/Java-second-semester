package classes;

import java.util.Scanner;

public class Method {
    public Method() {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(str.charAt(str.length() - 1));

        if (str.endsWith("!!!")) System.out.println("good!");
        else System.out.println("bad");

        if (str.startsWith("I like")) System.out.println("good!");
        else System.out.println("bad");

        if (str.contains("Java")) System.out.println("good!");
        else System.out.println("bad");

        String str1 = "I like Java";
        int index = str1.indexOf("Java");
        System.out.println(index);

        str = str.replace('a', 'o');
        System.out.println(str);

        str = str.toUpperCase();
        System.out.println(str);

        str = str.toLowerCase();
        System.out.println(str);

        System.out.println(str1.substring(index, index + 4));

    }
}
