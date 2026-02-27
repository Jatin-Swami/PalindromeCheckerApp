import java.util.*;
interface PalindromeStrategy {
    boolean isPalindrome(String str);
}
class StackStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()) {
            stack.push(ch);
        }
        char ch = str.charAt(0);
        for(int i = 0; i < str.length(); i++){
            ch = stack.pop();
            if(ch != str.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
class DequeStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String str) {
        Deque<Character> deque = new LinkedList<>();
        for(char ch : str.toCharArray()) {
            deque.add(ch);
        }
        while(!deque.isEmpty()) {
            if(deque.size() == 1) {
                break;
            }
            if(deque.pollFirst() != deque.pollLast()) {
                return false;
            }
        }
        return true;
    }
}
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = sc.nextLine();
        System.out.print("Choose Strategy:\n1. Stack Strategy\n2. Deque Strategy\n");
        int choice = sc.nextInt();
        long start = System.nanoTime();
        boolean isPalindrome = switch (choice) {
            case 1 -> {
                StackStrategy stack = new StackStrategy();
                yield stack.isPalindrome(text);
            }
            case 2 -> {
                DequeStrategy deque = new DequeStrategy();
                yield deque.isPalindrome(text);
            }
            default -> false;
        };
        long end = System.nanoTime();
        long time =  (end - start);
        System.out.println("Is it a Palindrome? " +  isPalindrome);
        System.out.println("Execution time: " + time + " ns");
    }
}