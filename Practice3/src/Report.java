public class Report {

    public static void generateReport(Employee[] emps) {
        for (int i = 0; i < emps.length; i++) {
            System.out.printf("%s %30.2f%n", emps[i].getFullname(), emps[i].getSalary());
        }
    }
}
