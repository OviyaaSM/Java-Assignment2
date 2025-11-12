class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}

public class StudentGrade {
    static void checkGrade(int marks) throws InvalidGradeException {
        if (marks > 100)
            throw new InvalidGradeException("Invalid Grade! Marks cannot exceed 100.");
        else
            System.out.println("Valid marks: " + marks);
    }

    public static void main(String[] args) {
        try {
            checkGrade(105);
        } catch (InvalidGradeException e) {
            System.out.println(e.getMessage());
        }
    }
}
