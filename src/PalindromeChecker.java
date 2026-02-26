public class PalindromeChecker {

    private static final String APP_NAME = "Palindrome Checker App";
    private static final String VERSION = "1.1";

    public static void main(String[] args) {

        showWelcomeMessage();

        // New Feature: Hardcoded String Check
        checkHardcodedString();

        System.out.println("Application execution completed.");
    }

    // Welcome Message (UC1)
    private static void showWelcomeMessage() {
        System.out.println("======================================");
        System.out.println("        " + APP_NAME);
        System.out.println("        Version: " + VERSION);
        System.out.println("======================================");
        System.out.println();
    }

    // UC2: Hardcoded Palindrome Feature
    private static void checkHardcodedString() {

        String word = "madam";   // Hardcoded string literal

        boolean result = isPalindrome(word);

        if (result) {
            System.out.println("The string \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + word + "\" is NOT a Palindrome.");
        }
    }

    // Reusable Palindrome Logic
    private static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}