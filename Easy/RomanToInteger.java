public class RomanToInteger {
    public static int romanToInt(String s) {
        if (s.length() == 1) {
            char c = s.charAt(0);
            return getInt(c);
        }
        else {
            char[] c = s.toCharArray();
            int sum = 0;

            for (int index = 0; index < c.length - 1; index++){
                sum += getInt(c[index], c[index + 1]);
                if ((getInt(c[index + 1]) - getInt(c[index])) == getInt(c[index], c[index + 1])) index++;
            }
            int length = c.length;

            if ((getInt(c[length - 1]) - getInt(c[length - 2])) == getInt(c[length - 2], c[length - 1])) {
                return sum;
            }
            else return sum + getInt(c[length - 1]);
        }
    }
    public static int getInt(char c, char d) {
        String s = "" + c + d;

        return switch (s) {
            case "IV" -> 4;
            case "IX" -> 9;
            case "XL" -> 40;
            case "XC" -> 90;
            case "CD" -> 400;
            case "CM" -> 900;
            default -> getInt(c);
        };

    }

    public static int getInt(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MMXXIV"));

    }
}
