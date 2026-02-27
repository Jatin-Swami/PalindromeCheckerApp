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
        Queue<Character> queue = new LinkedList<>();
        for(char ch : text.toCharArray()) {
            queue.offer(ch);
        }
        boolean isPalindrome = true;
        while(!queue.isEmpty()) {
            if(queue.poll() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}