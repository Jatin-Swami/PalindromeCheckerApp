    import java.util.*;
    public class PalindromeCheckerApp {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input text: ");
            String text = sc.nextLine();
            char[] arr = text.toCharArray();
            boolean isPalindrome = true;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] != arr[arr.length - i - 1]){
                    isPalindrome = false;
                    break;
                }
            }
            System.out.println("Is it a Palindrome? : " + isPalindrome);
        }
    }