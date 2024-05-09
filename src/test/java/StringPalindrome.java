import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = scr.nextLine();
        scr.close();

        if (isPalindrome(str)) {
            System.out.println("The string \"" + str + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + str + "\" is not a palindrome.");
        }
    }

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

}
