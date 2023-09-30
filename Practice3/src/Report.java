public class Report {

    public static void generateReport(Employee[] emps) {
        System.out.printf("Fullname %32s%n", "salary");
        for (int i = 0; i < emps.length; i++) {
            System.out.printf("%s) %-20s %20.2f%n", i + 1, emps[i].getFullname(), emps[i].getSalary());
        }
    }
}
