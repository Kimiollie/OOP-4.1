import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        System.out.print("Enter input: "); //Prompt user to enter input for checking palindrome
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close(); //Close the scanner to avoid resource leaks

        //Transform the input string by converting to lowercase and removing unwanted characters
        String transformed = transformInput(input);

        //Check if the transformed input is a palindrome
        boolean isPalindrome = checkPalindrome(transformed);
        if (isPalindrome) {
            System.out.println("The transformed input is a palindrome.");
        } else {
            System.out.println("The transformed input is not a palindrome.");
        }
    }

    public static String transformInput(String input) {
        input = input.toLowerCase();
        input = input.replaceAll("[,!]", ""); //Remove commas and exclamation marks
        return input;
    }

    public static boolean checkPalindrome(String input) {
        String reversed = reverseString(input); //Reverse the input string
        return input.equals(reversed); //Check if the input string is equal to its reversed version
    }

    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString(); //Use StringBuilder to reverse the string
    }
}