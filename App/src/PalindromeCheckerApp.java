    import java.util.*;
    public class PalindromeCheckerApp {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input text: ");
            String text = sc.nextLine();
            String reverse = "";
            for(int i = text.length() - 1; i >= 0; i--) {
                reverse += text.charAt(i);
            }
            System.out.println("Is it a Palindrome? : " + text.equals(reverse));
        }
    }