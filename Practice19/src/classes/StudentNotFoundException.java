package classes;

public class StudentNotFoundException extends Exception{
    public StudentNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
