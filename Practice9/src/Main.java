import classes.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("1)");
        new testSort().sortByInserts();
        System.out.println("\n\n2)");
        new SortingStudentsByGPA().startSort();
        System.out.println("\n\n3)");
        new testSort().merge();

    }
}