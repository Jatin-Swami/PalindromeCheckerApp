import java.util.*;
public class PalindromeCheckerApp {
    static boolean isPalindrome(String str, int start, int end) {
        if(start >= end) {
            return true;
        }
        if(str.charAt(start) == str.charAt(end) || str.charAt(start) == Character.toUpperCase(str.charAt(end)) || str.charAt(start) == Character.toLowerCase(str.charAt(end))) {
            return isPalindrome(str, ++start, --end);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = sc.nextLine();
        text = text.trim();
        int end = text.length();
        System.out.println("Is it a Palindrome? " + isPalindrome(text, 0, end - 1));
    }
}