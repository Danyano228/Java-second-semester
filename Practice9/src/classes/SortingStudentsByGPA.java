package classes;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student>{

    static Student[] students = {new Student(34, 68), new Student(3, 56),
                          new Student(4, 29), new Student(35, 34),
                          new Student(2, 100), new Student(3, 98)};

    public void startSort() {
        quickSort(students, 0, students.length - 1);
        printStudents();
    }

    public static void printStudents() {
        System.out.println("Sorted array of students:");
        for (int i = 0; i < 6; i++) {
            System.out.println(students[i].toString());
        }
    }

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getMark() < o2.getMark())
            return 1;
        else if (o1.getMark() > o2.getMark())
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
            while (1 == compare(students[i], lastStudent)) i++;
            while (-1 == compare(students[j], lastStudent)) j--;

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


}
