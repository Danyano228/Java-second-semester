package classes;


public class Student {
        private String name;
        private String surname;
        private String specialization;
        private int curs;
        private String group;
        private int GPA;

    public Student(String name, String surname,
                   String specialization, int curs, String group,
                   int GPA) {
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
        this.curs = curs;
        this.group = group;
        this.GPA = GPA;
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
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", specialization='" + specialization + '\'' +
                ", curs=" + curs +
                ", group='" + group + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}
