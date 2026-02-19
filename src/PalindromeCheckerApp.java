import java.util.Scanner;

public class PalindromeCheckerApp {

    static class UseCase2 {
        boolean checkPalindrome(String text) {
            char[] chars = text.toCharArray();
            int start = 0;
            int end = chars.length - 1;
            boolean isPalindrome = true;
            while (start < end) {
                if (chars[start] != chars[end]) {
                    isPalindrome = false;
                    break; // stop early if mismatch found
                }
                start++;
                end--;
            }
            return isPalindrome;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        UseCase2 u2 = new UseCase2();

        System.out.print("Input Text: ");
        String text1 = input.next();
        System.out.println("Is it a Palindrome: " + u2.checkPalindrome(text1));

        System.out.print("Input Text: ");
        String text2 = input.next();
        System.out.println("Is it a Palindrome: " + u2.checkPalindrome(text2));

        input.close();
    }
}