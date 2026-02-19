import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = scanner.nextLine();
        
        char[] charArray = input.toCharArray();
        boolean isPalindrome = true;
        int start = 0, end = charArray.length - 1;

        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        
        System.out.println(input + (isPalindrome ? " is a palindrome." : " is NOT a palindrome."));
        scanner.close();
    }
}
