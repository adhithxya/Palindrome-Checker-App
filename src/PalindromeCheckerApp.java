
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static boolean isPalindrome(String text) {

        String cleaned = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();


        String reversed = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindrome Checker  ");
        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println(" It's a Palindrome!");
        } else {
            System.out.println("Not a Palindrome.");
        }

        scanner.close();
    }
}

public static boolean isPalindrome(String text) {
    // Remove non-alphanumeric characters and convert to lowercase
    String cleaned = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

    // Reverse the string
    String reversed = new StringBuilder(cleaned).reverse().toString();

    return cleaned.equals(reversed);
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Palindrome Checker");
    System.out.print("Enter text: ");
    String input = scanner.nextLine();

    if (isPalindrome(input)) {
        System.out.println("It's a Palindrome!");
    } else {
        System.out.println("Not a Palindrome.");
    }

    scanner.close();
}
