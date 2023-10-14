public class Main {
    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.test();

        Person per1 = new Person();
        Person per2 = new Person("Volk Michalich", 21);
        System.out.println("\n" + per1.fullname + " " + per1.age + "\n" +
                per2.fullname + " " + per2.age);
    }
}