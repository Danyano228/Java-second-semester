import classes.*;

import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void task1() {
        System.out.println("1)");

        System.out.println("ФИО: Павлов даниил Дмитриевич");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.YEAR, 2023);
        cal.set(Calendar.MONTH, Calendar.SEPTEMBER);
        cal.set(Calendar.DAY_OF_MONTH, 2);
        cal.set(Calendar.HOUR_OF_DAY, 12);
        cal.set(Calendar.MINUTE, 40);
        cal.set(Calendar.SECOND, 0);

        System.out.println("Дата получения задания: " + sdf.format(cal.getTime()));

        System.out.println("Дата сдачи задания: " +
                sdf.format(Calendar.getInstance(Calendar.getInstance().getTimeZone()).getTime()));

    }

    public static void task2() {
        System.out.println("2)");

        Calendar cal_user = Calendar.getInstance();
        Calendar cal_sys;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");

        Scanner in = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = in.nextInt();
        System.out.print("Введите номер месяца: ");
        int month = in.nextInt();
        System.out.print("Введите день: ");
        int day = in.nextInt();
        System.out.print("Введите время через двоеточие (чч:мм:сс): ");
        String time = in.next();
        int hour, minute, second;
        try {
            hour = Integer.parseInt(time.substring(0, 2));
            minute = Integer.parseInt(time.substring(3, 5));
            second = Integer.parseInt(time.substring(6, 8));
        } catch (StringIndexOutOfBoundsException error) {
            hour = 0;
            minute = 0;
            second = 0;
        }

        cal_user.set(Calendar.YEAR, year);
        cal_user.set(Calendar.MONTH, month - 1);
        cal_user.set(Calendar.DAY_OF_MONTH, day);
        cal_user.set(Calendar.HOUR_OF_DAY, hour);
        cal_user.set(Calendar.MINUTE, minute);
        cal_user.set(Calendar.SECOND, second);

        cal_sys = Calendar.getInstance(Calendar.getInstance().getTimeZone());

        System.out.println("Текушее время: " + sdf.format(cal_sys.getTime()));
        System.out.println("Время пользователя: " + sdf.format(cal_user.getTime()));

        if (cal_user.get(Calendar.YEAR) < cal_sys.get(Calendar.YEAR)) {
            System.out.println("Чай остыл!");
        } else if (cal_user.get(Calendar.YEAR) > cal_sys.get(Calendar.YEAR)) {
            System.out.println("Чай не готов...");
        } else if (cal_user.get(Calendar.MONTH) < cal_sys.get(Calendar.MONTH)) {
            System.out.println("Чай остыл!");
        } else if (cal_user.get(Calendar.MONTH) > cal_sys.get(Calendar.MONTH)) {
            System.out.println("Чай не готов...");
        } else if (cal_user.get(Calendar.DAY_OF_MONTH) < cal_sys.get(Calendar.DAY_OF_MONTH)) {
            System.out.println("Чай остыл!");
        } else if (cal_user.get(Calendar.DAY_OF_MONTH) > cal_sys.get(Calendar.DAY_OF_MONTH)) {
            System.out.println("Чай не готов...");
        } else if (cal_user.get(Calendar.HOUR_OF_DAY) < cal_sys.get(Calendar.HOUR_OF_DAY)) {
            System.out.println("Чай остыл!");
        } else if (cal_user.get(Calendar.HOUR_OF_DAY) > cal_sys.get(Calendar.HOUR_OF_DAY)) {
            System.out.println("Чай не готов...");
        } else if (Math.abs(cal_user.get(Calendar.MINUTE) - cal_sys.get(Calendar.MINUTE)) > 10) {
            System.out.println("Чай остыл!");
        } else if (Math.abs(cal_user.get(Calendar.MINUTE) - cal_sys.get(Calendar.MINUTE)) < 10) {
            System.out.println("Чай стынет!");
        } else if (cal_user.get(Calendar.MINUTE) > cal_sys.get(Calendar.MINUTE)) {
            System.out.println("Чай не готов...");
        } else if (cal_user.get(Calendar.SECOND) < cal_sys.get(Calendar.SECOND)) {
            System.out.println("Чай стынет!");
        } else if (cal_user.get(Calendar.SECOND) > cal_sys.get(Calendar.SECOND)) {
            System.out.println("Чай не готов...");
        } else {
            System.out.println("Пора пить чай");
        }

    }

    public static void task3() {
        System.out.println("3)");
        Student student = new Student("One", "Student", "Student",
                                      2, "IVBO-02-22", -100,
                                      2004, 11, 18,
                                      12, 38, 0);
        System.out.println(student.toString());
    }

    public static void task4() {
        System.out.println("4)");

        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        int month = in.nextInt();
        int day = in.nextInt();
        int hour = in.nextInt();
        int minute = in.nextInt();

        Date date = new Date(year - 1900, month - 1, day, hour, minute);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.HOUR_OF_DAY, hour);
        cal.set(Calendar.MINUTE, minute);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd\nhh mm");

        System.out.println("Date: " + sdf.format(date));
        System.out.println("Calendar: " + sdf.format(cal.getTime()));
    }

    public static void task5() {
        System.out.println("5)");



        ArrayList<Integer> list = new ArrayList<Integer>();
        LinkedList<Integer> linked_list = new LinkedList<Integer>();
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }
        System.out.println("ArrayList: вставка " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linked_list.add(i);
        }
        System.out.println("LinkedList: вставка " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            list.remove(0);
        }
        System.out.println("ArrayList: удаление " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linked_list.remove(0);
        }
        System.out.println("LinkedList: удаление " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            list.add(0, i);
        }
        System.out.println("ArrayList: добавление " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            linked_list.add(0, i);
        }
        System.out.println("LinkedList: добавление " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            list.contains(i);
        }
        System.out.println("ArrayList: поиска " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            linked_list.contains(i);
        }
        System.out.println("LinkedList: поиска " + (System.nanoTime() - startTime));

    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
}