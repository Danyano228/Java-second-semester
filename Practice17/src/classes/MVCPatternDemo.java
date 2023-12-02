package classes;

public class MVCPatternDemo {

    public void main(String[] args) {
        Student model = retriveStudentFromDatabase();

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("2");
        controller.setStudentRollNo("2");
        System.out.println("\nStudent Details after updating:");
        controller.updateView();
    }

    public Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Student");
        student.setRollNo("lol");
        return student;
    }
}
