import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = scanner.nextLine();

        boolean result = isPalindrome(input, 0, input.length() - 1);
        System.out.println(input + (result ? " is a palindrome." : " is not a palindrome."));
        scanner.close();
    }

    // Recursive method [cite: 38]
    public static boolean isPalindrome(String s, int start, int end) {
        // Base conditions [cite: 36, 39]
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        
        // Recursive call [cite: 35]
        return isPalindrome(s, start + 1, end - 1);
    }
}
