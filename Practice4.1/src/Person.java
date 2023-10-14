public class Person {
    String fullname = "Ivan Ivanov";
    int age = 0;

    public Person() {
    }

    public Person(String fullname, int age) {
        this.fullname = fullname;
        this.age = age;
    }

    public void move() {
        System.out.printf("%n%s is moving", fullname);
    }

    public void talk() {
        System.out.printf("%n%s is talking", fullname);
    }
}
