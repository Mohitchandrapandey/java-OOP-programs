import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase for a case-insensitive check
        str = str.replaceAll("\\s+", "").toLowerCase();
        
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
// This program checks if a given string is a palindrome. It ignores spaces and is case-insensitive.
// It uses the Scanner class to read input from the user and the StringBuilder class to reverse the string.