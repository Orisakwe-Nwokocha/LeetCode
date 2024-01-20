public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String s = x + "";
        String result = "";
        for (int index = s.length() - 1; index >= 0; index--) {
            result += s.charAt(index);
        }
        return s.equals(result);
    }
}
