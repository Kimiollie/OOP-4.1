import java.util.Scanner;

public class PalindromeChecker {

    /*
    a word, phrase, or sequence that reads the same backwards as forwards, e.g. madam or nurses run.
     */

    public static void main(String[] args) {

        // instantiate a scanner which take input from keyboard
        Scanner scanner = new Scanner(System.in);
        // the scanner read from the begining of the sentence until reading character "\n" = user enter "Enter"
        String input = scanner.nextLine();

        String transformed = transformInput(input);

//        boolean isPalindrome = checkPalindrome(transformed);
        if (checkPalindrome((transformed))) {
            System.out.println("The transformed input is a palindrome.");
        } else {
            System.out.println("The transformed input is not a palindrome.");
        }
    }

    public static String transformInput(String input) {
        //turn the input String to lowerCased String
        input = input.toLowerCase();
        // remove all ',' inside ths String
        input = input.replace(",", "");
        // remove all '!' inside the String
        input = input.replace("!", "");
        return input;
    }

    public static boolean checkPalindrome(String input) {
        String reversed = reverseString(input);
        return input.equals(reversed);
    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
}