package classes;

public class testSort{

    static Student[] students = {new Student(34), new Student(3),
                          new Student(4),  new Student(35),
                          new Student(2), new Student(33)};

    static Student[] students2 = {new Student(36), new Student(98),
                           new Student(47),  new Student(36),
                           new Student(21), new Student(83)};

    static Student[] mergeStudents = new Student[12];

    public void sortByInserts() {
        for (int left = 0; left < students.length; left++) {
            Student value = students[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (0 > value.compareTo(students[i])) {
                    students[i + 1] = students[i];
                } else {
                    break;
                }
            }
            students[i + 1] = value;
        }
        printStudents();
    }

    public static void sortByInserts(Student[] students) {
        for (int left = 0; left < students.length; left++) {
            Student value = students[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (0 > value.compareTo(students[i])) {
                    students[i + 1] = students[i];
                } else {
                    break;
                }
            }
            students[i + 1] = value;
        }
        printStudents();
    }

    public static void printStudents() {
        System.out.println("Sorted array of students:");
        for (int i = 0; i < 6; i++) {
            System.out.println(students[i].toString());
        }
    }

    public static void printMerge() {
        System.out.println("Merged sorted array of students:");
        for (int i = 0; i < mergeStudents.length; i++) {
            System.out.println(mergeStudents[i].toString());
        }
    }

    public static void merge() {
        sortByInserts(students2);
        mergeStudents = new Student[students.length + students2.length];
        int i = 0, j = 0, k = 0;
        while (i < students.length && j < students2.length)
            if (students[i].getId() < students2[j].getId()) {
                mergeStudents[k++] = students[i++];
            }
            else mergeStudents[k++] = students2[j++];
        while (i < students.length)
            mergeStudents[k++] = students[i++];
        while (j < students2.length)
            mergeStudents[k++] = students2[j++];
        printMerge();
    }
}
