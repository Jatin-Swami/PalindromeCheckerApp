import java.util.*;

class Node {
    char ch;
    Node next;
    Node(char ch) {
        this.ch = ch;
        this.next = null;
    }
}

public class PalindromeCheckerApp {
    static Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = sc.nextLine();

        if (text.isEmpty()) {
            System.out.println("Is it a Palindrome? true");
            return;
        }

        Node head = new Node(text.charAt(0));
        Node temp = head;
        for (int i = 1; i < text.length(); i++) {
            temp.next = new Node(text.charAt(i));
            temp = temp.next;
        }

        Node mid = findMid(head);
        Node p2 = reverseList(mid);
        Node p1 = head;

        boolean isPalindrome = true;
        while (p2 != null) {
            if (p1.ch != p2.ch) {
                isPalindrome = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        System.out.println("Is it a Palindrome? " + isPalindrome);
    }
}