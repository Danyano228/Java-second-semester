package classes;

public class Student implements Comparable<Student>{
    private int id;

    private int mark;

    public Student(int id) {
        this.id = id;
        this.mark = 0;
    }

    public Student(int id, int mark) {
        this.id = id;
        this.mark = mark;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", mark=" + mark +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getId() - o.getId();
    }
}
