import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IntegerConstants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.print("Enter something: ");
            input = scanner.nextLine();

            String regex = "\\d+"; // zad 1v
            //String regex = "^[a-zA-Z0-9]+$"; // zad 2v

            if (input.matches(regex)) {
                System.out.println("Valid input: " + input);
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        } while (true);
        scanner.close();
    }
}
