import java.util.Arrays;
import java.math.BigInteger;
public class PlusOne {
    public static int[] plusOne(int[] digits) {
	BigInteger bigInteger; //= new BigInteger();
        
	String s = "";
        for (int i = 0; i < digits.length; i++) {
            s += digits[i];
        }


	bigInteger = new BigInteger(s);
	bigInteger = bigInteger.add(BigInteger.valueOf(1));

        s = String.valueOf(bigInteger);
        int[] result = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            result[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        return result;

    }

	public static void main(String... args) {

		System.out.println(Arrays.toString(plusOne(new int[]{7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6})));
	}

}