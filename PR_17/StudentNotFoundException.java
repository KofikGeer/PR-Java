package PR_17_2;

// Исключение, бросаемое при отсутствии студента
public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}