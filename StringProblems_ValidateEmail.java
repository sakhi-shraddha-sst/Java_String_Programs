import java.util.*;

public class StringProblems_ValidateEmail {

    // 27. Validate an email address format
    public static boolean isValidEmail(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }

    public static void main(String[] args) {

        System.out.println("Valid Email: " +
                isValidEmail("john.doe123@gmail.com"));

        System.out.println("Valid Email: " +
                isValidEmail("john@company"));

        System.out.println("Valid Email: " +
                isValidEmail("john@"));

        System.out.println("Valid Email: " +
                isValidEmail("john.com"));
    }
}