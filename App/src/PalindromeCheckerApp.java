import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = sc.nextLine();
        Deque<Character> deque = new LinkedList<>();
        for(char ch : text.toCharArray()) {
            deque.add(ch);
        }
        boolean isPalindrome = true;
        while(!deque.isEmpty()) {
            if(deque.size() == 1) break;
            if(deque.pollFirst() != deque.pollLast()) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is it a Palindrome? " + isPalindrome);
    }
}