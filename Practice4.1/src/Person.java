public class Person {
    String fullname;
    int age;

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
