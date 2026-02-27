import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        for(char ch : text.toCharArray()) {
            stack.push(ch);
        }
        boolean isPalindrome = true;
        char ch;
        for(int i = 0; i < text.length(); i++){
            ch = stack.pop();
            if(ch != text.charAt(i)){
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}