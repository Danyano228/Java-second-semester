package classes;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Student {
    private String name;
    private String surname;
    private String specialization;
    private int curs;
    private String group;
    private int GPA;
    private Calendar birthday = Calendar.getInstance();
    SimpleDateFormat sdf_full = new SimpleDateFormat("EEEE, d MMMM yyyy, HH:mm:ss");
    SimpleDateFormat sdf_ave = new SimpleDateFormat("EE, d.MM.yyyy, HH:mm:ss");
    SimpleDateFormat sdf_short = new SimpleDateFormat("d.MM.yyyy");

    public Student(String name, String surname,
                   String specialization, int curs, String group,
                   int GPA, int year, int month, int day, int hour, int minute, int second) {
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
        this.curs = curs;
        this.group = group;
        this.GPA = GPA;
        this.birthday.set(Calendar.YEAR, year);
        this.birthday.set(Calendar.MONTH, month - 1);
        this.birthday.set(Calendar.DAY_OF_MONTH, day);
        this.birthday.set(Calendar.HOUR_OF_DAY, hour);
        this.birthday.set(Calendar.MINUTE, minute);
        this.birthday.set(Calendar.SECOND, second);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setCurs(int curs) {
        this.curs = curs;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getCurs() {
        return curs;
    }

    public String getGroup() {
        return group;
    }

    public int getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите формат вывода даты (short, average, full): ");
        String str = in.next();
        String returning = "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", specialization='" + specialization + '\'' +
                ", curs=" + curs +
                ", group='" + group + '\'' +
                ", GPA=" + GPA +
                ", birthday=";
        if (str.equals("short")) {
            return  returning + sdf_short.format(birthday.getTime()) +
                    '}';
        } else if (str.equals("average")) {
            return returning + sdf_ave.format(birthday.getTime()) +
                    '}';
        } else {
            return returning + sdf_full.format(birthday.getTime()) +
                    '}';
        }
    }
}
