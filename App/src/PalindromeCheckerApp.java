import java.util.*;
public class PalindromeCheckerApp {
    static boolean isPalindrome(String str, int start, int end) {
        if(start >= end) {
            return true;
        }
        if(str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, ++start, --end);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = sc.nextLine();
        System.out.println("Is it a Palindrome? " + isPalindrome(text, 0, text.length() -1 ));
    }
}