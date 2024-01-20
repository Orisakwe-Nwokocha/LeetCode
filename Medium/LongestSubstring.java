import java.util.ArrayList;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {

        char[] c = s.toCharArray();
        ArrayList<Character> result = new ArrayList<>();
        boolean condition = false;

        int ind = 0;
        for (int count = 0; count < c.length; count++) {
            for (int index = 0; index < c.length; index++) {
                if (c[index] == c[count] && count != index) {
                    ind = index;
                    condition = true;
                    break;
                }
            }
            if (condition) break;
        }
        System.out.println(ind);
        if (ind == c.length - 1) {
            for (char value : c) {
                if (result.contains(value)) continue;
                result.add(value);
            }
        }

        else {
            for (int count = ind; count < c.length; count++) {
                if (result.contains(c[count])) continue;
                result.add(c[count]);
            }
        }
        System.out.println(result);
        return result.size();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("cdd"));
    }
}
