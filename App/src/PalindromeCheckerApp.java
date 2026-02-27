import java.util.*;
class PalindromeChecker {
    String str;
    public boolean checkPalindrome() {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    PalindromeChecker(String str) {
        this.str = str;
    }
}
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = sc.nextLine();
        PalindromeChecker object = new PalindromeChecker(text);
        System.out.println("Is it a Palindrome? " + object.checkPalindrome());
    }
}