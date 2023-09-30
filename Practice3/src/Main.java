public class Main {
    public static void main(String[] args) {
        int length = 10;
        First arrs = new First(length);
        arrs.printArr();
        arrs.sort();
        arrs.printArr();

        Employee[] emps = new Employee[3];
        emps[0] = new Employee("Volk Vova 1", 1.011);
        emps[1] = new Employee("Volk Vova 2", 2.022);
        emps[2] = new Employee("Volk Vova 3", 3.033);

        Report.generateReport(emps);
    }
}