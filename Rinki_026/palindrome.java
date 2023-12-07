public class palindrome {

    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase.
        str = str.toLowerCase();

        // Get the first and last characters of the string.
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);

        // Compare the first and last characters of the string.
        if (firstChar == lastChar) {
            // The string is a palindrome.
            return true;
        } else {
            // The string is not a palindrome.
            return false;
        }
    }

    public static void main(String[] args) {
        // Test the isPalindrome() method.
        System.out.println(isPalindrome("racecar")); // true
        System.out.println(isPalindrome("kayak")); // true
        System.out.println(isPalindrome("stressed")); // false
    }
}