package classes;

public class Person {
    String surname = "";
    String name = "";
    String lastname = "";

    public Person(String surname) {
        this.surname = surname;
    }

    public Person(String surname, String name) {
        this.surname = surname;
        this.name =  name;
    }

    public Person(String surname, String name, String lastname) {
        this.surname = surname;
        this.name = name;
        this.lastname =  lastname;
    }

    public String getFullName() {
        if (name.equals("")) return surname;
        else if (lastname.equals("")) return surname + " " + name;
        else return surname + " " + name + " " + lastname;
    }
}
