import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean palindrome = true;
        System.out.print("Input text: ");
        String text = sc.nextLine();
        for(int i = 0; i < text.length() / 2; i++) {
            if(text.charAt(i) != text.charAt(text.length() - i - 1)) {
                palindrome = false;
                break;
            }
        }
        System.out.println("Is it a Palindrome? : " +  palindrome);
    }
}