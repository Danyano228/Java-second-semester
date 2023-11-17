package classes;

import java.util.Comparator;
import java.util.TreeSet;

public class SortingStudentsByGPA implements Comparator<Student>{

    Student[] students;

    public void setArray(Student[] students) {
        this.students = students;
    }

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getGPA() < o2.getGPA())
            return 1;
        else if (o1.getGPA() > o2.getGPA())
            return -1;
        else return 0;
    }

    public int comparef(Student o1, Student o2) {
        if (o1.getCurs() < o2.getCurs())
            return 1;
        else if (o1.getCurs() > o2.getCurs())
            return -1;
        else return 0;
    }

    public void quickSort(Student[] students, int low, int high, int n, boolean f) {
        if (students.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        Student lastStudent = students[middle];

        int i = low, j = high;
        while (i <= j) {
            if (!f) {
                while (-n == compare(students[i], lastStudent)) i++;
                while (n == compare(students[j], lastStudent)) j--;
            }
            else {
                while (-n == comparef(students[i], lastStudent)) i++;
                while (n == comparef(students[j], lastStudent)) j--;
            }
            if (i <= j) {
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(students, low, j, n, f);
        if (high > i)
            quickSort(students, i, high, n, f);
    }

    public Student[] mergeSort(Student[] s1, boolean f) {
        if (s1 == null) {
            return null;
        }
        if (s1.length < 2) {
            return s1;
        }
        int mid = s1.length / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[s1.length - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = s1[i];
        }
        for (int i = mid; i < s1.length; i++) {
            r[i - mid] = s1[i];
        }
        mergeSort(l, f);
        mergeSort(r, f);

        return merge(l, r, f);
    }

    /*public Student[] sortArray(Student[] arrayA, boolean f){
        if (arrayA == null) {
            return null;
        }
        if (arrayA.length < 2) {
            return arrayA;
        }
        Student[] arrayB = new Student[arrayA.length / 2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);

        Student[] arrayC = new Student[arrayA.length - arrayA.length / 2];
        System.arraycopy(arrayA, arrayA.length / 2, arrayC, 0, arrayA.length - arrayA.length / 2);

        arrayB = sortArray(arrayB, f);
        arrayC = sortArray(arrayC, f);

        return merge(arrayB, arrayC, f);
    }*/

    public Student[] merge(Student[] s1, Student[] s2, boolean f) {
        Student[] mergeStudents = new Student[s1.length + s2.length];
        int i = 0, j = 0, k = 0;
        while (i < s1.length && j < s2.length)
            if (!f) {
                if (1 == compare(s1[i], s2[j])) {
                    mergeStudents[k++] = s2[i++];
                } else mergeStudents[k++] = s2[j++];
            }
            else {
                if (1 == comparef(s1[i], s2[j])) {
                    mergeStudents[k++] = s2[i++];
                } else mergeStudents[k++] = s2[j++];
            }
        while (i < s1.length)
            mergeStudents[k++] = s1[i++];
        while (j < s2.length)
            mergeStudents[k++] = s2[j++];
        return mergeStudents;
    }

    public void outArray(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }
    }

    public int main(String[] args) {
        Student[] students = {
                new Student("Ivan", "Kopeev",
                        "human", 2,
                        "IVBO-02-22", 1),
                new Student("Volf", "Volf",
                        "volf", 2,
                        "IVBO-02-22", 90),
                new Student("Kurill", "ZemliaNika",
                        "ZemliaNika", 2,
                        "IVBO-02-22", 60),
                new Student("Danilaaa", "Nikolay",
                        "humanity", 2,
                        "IVBO-02-22", 90),
                new Student("Danyan", "Danyanov",
                        "Danyan", 2,
                        "IVBO-02-22", 88)};

        Student[] students1 = {
                new Student("1", "1",
                        "1", 1,
                        "YEBO-01-23", 0),
                new Student("2", "2",
                        "2", 1,
                        "YEBO-02-23", -3),
                new Student("starosta", "starik",
                        "eating big, long, wide bananas", 2,
                        "IVBO-02-22", -1000)};

        setArray(students);

        boolean n = false;

        quickSort(this.students, 0, this.students.length - 1, 1, n);
        System.out.println("Array:");
        outArray(this.students);
        System.out.println("3)");

        quickSort(students, 0, students.length - 1, -1 ,n);
        quickSort(students1, 0, students1.length - 1, -1, n);
        Student[] mergedStudents = merge(students, students1, n);
        for (int i = 0; i < mergedStudents.length; i++) {
            System.out.println(mergedStudents[i].toString());
        }
        return 0;
    }
}
