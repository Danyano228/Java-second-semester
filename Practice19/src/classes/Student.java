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
                   int GPA) throws Exception {
        if (name == "" || surname == "" || specialization == "" || group == "")
            throw new EmptyStringException("String is empty");
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
        this.curs = curs;
        this.group = group;
        this.GPA = GPA;
    }

    public void setName(String name) throws Exception {
        if (name == "") throw new EmptyStringException("String is empty");
        this.name = name;
    }

    public void setSurname(String surname) throws Exception {
        if (name == "") throw new EmptyStringException("String is empty");
        this.surname = surname;
    }

    public void setSpecialization(String specialization) throws Exception {
        if (name == "") throw new EmptyStringException("String is empty");
        this.specialization = specialization;
    }

    public void setCurs(int curs) throws Exception {
        if (name == "") throw new EmptyStringException("String is empty");
        this.curs = curs;
    }

    public void setGroup(String group) throws Exception {
        if (name == "") throw new EmptyStringException("String is empty");
        this.group = group;
    }

    public void setGPA(int GPA) throws Exception {
        if (name == "") throw new EmptyStringException("String is empty");
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
