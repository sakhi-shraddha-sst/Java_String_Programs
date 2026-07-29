import java.util.*;

public class StringProblems_Camel_To_Snake_Case {

    // 28. Convert CamelCase to snake_case
    public static String camelToSnake(String str) {
        return str.replaceAll("([a-z])([A-Z])", "$1_$2")
                  .toLowerCase();
    }

    public static void main(String[] args) {

        System.out.println("Camel to Snake: "
                + camelToSnake("camelCaseString"));

        System.out.println("Camel to Snake: "
                + camelToSnake("myFirstJavaProgram"));

        System.out.println("Camel to Snake: "
                + camelToSnake("studentName"));
    }
}