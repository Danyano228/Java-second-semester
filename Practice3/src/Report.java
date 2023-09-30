public class Report {

    public static void generateReport(Employee[] emps) {
        for (Employee emp : emps) {
            System.out.printf("%s %30.2f%n", emp.getFullname(), emp.getSalary());
        }
    }
}
