import classes.*;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        System.out.println("1)");
        new Method();

        System.out.println("2)");

        Person person = new Person("Pavlov", "Daniil", "Dmitrievich");

        long startTime = System.nanoTime();
        System.out.println(person.getFullName());
        System.out.println(System.nanoTime() - startTime);
    }
}