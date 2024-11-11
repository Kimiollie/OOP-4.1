import java.util.Scanner;

public class PalindromeChecker {

    /*
    a word, phrase, or sequence that reads the same backwards as forwards, e.g. madam or nurses run.
     */

    public static void main(String[] args) {

        System.out.print("Enter input: "); //Prompt user to enter input for checking palindrome
        // instantiate a scanner which take input from keyboard
        Scanner scanner = new Scanner(System.in);
        // the scanner read from the begining of the sentence until reading character "\n" = user enter "Enter"
        String input = scanner.nextLine();
        scanner.close(); //Close the scanner to avoid resource leaks

        //Transform the input string by converting to lowercase and removing unwanted characters
        String transformed = transformInput(input);

        //Check if the transformed input is a palindrome
        if (checkPalindrome((transformed))) {
            System.out.println("The transformed input is a palindrome.");
        } else {
            System.out.println("The transformed input is not a palindrome.");
        }
    }

    public static String transformInput(String input) {
        //turn the input String to lowerCased String
        input = input.toLowerCase();
        input = input.replaceAll("[,!]", ""); //Remove commas and exclamation marks
        return input;
    }

    public static boolean checkPalindrome(String input) {
        String reversed = reverseString(input);
        return input.equals(reversed);
    }

    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString(); //Use StringBuilder to reverse the string
    }
}