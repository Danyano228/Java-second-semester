package classes;

import java.util.Arrays;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student>{

    Student[] students;

    public SortingStudentsByGPA() {
        new ActionListenerExample(this);
    }

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getGPA() < o2.getGPA())
            return 1;
        else if (o1.getGPA() > o2.getGPA())
            return -1;
        else return 0;
    }

    public void quickSort(Student[] students, int low, int high) {
        if (students.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        Student lastStudent = students[middle];

        int i = low, j = high;
        while (i <= j) {
            while (-1 == compare(students[i], lastStudent)) i++;
            while (1 == compare(students[j], lastStudent)) j--;
            if (i <= j) {
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(students, low, j);
        if (high > i)
            quickSort(students, i, high);
    }

    public void addStudent(String name, String surname, String specialization,
                           int curs, String group, int GPA) throws Exception{
        if (students == null) students = new Student[1];
        else {
            Student[] clones = Arrays.copyOf(students, students.length);
            students = new Student[students.length + 1];
            for (int i = 0; i < clones.length; i++) {
                students[i] = clones[i];
            }
        }
        students[students.length - 1] = new Student(name, surname, specialization,
                curs, group, GPA);
    }

    public String findStudent(String surname) throws StudentNotFoundException {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getSurname().equals(surname)) return students[i].toString();
        }
        throw new StudentNotFoundException("List of students is empty");
    }

    public void sortStudents() {
        quickSort(students, 0, students.length - 1);
    }

    public String getStudents() {
        StringBuilder list = new StringBuilder();
        for (Student student : students) {
            list.append("\n").append(student.toString());
        }
        return list.toString();
    }
}
