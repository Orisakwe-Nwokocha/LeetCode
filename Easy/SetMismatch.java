import java.util.ArrayList;
import java.util.Arrays;

public class SetMismatch {
    public static int[] findErrorNums(int[] nums) {
          ArrayList<Integer> compareNumbers = new ArrayList<>();

	int duplicate = 0;
        Arrays.sort(nums);	    
	int missingNumber = 0;
	int count = 0;

	for (int i = 1; i <= nums[nums.length - 1]; i++) {
		if (nums[count] != i) {
			missingNumber = i;
		}
		count++;
    	}
        
        count = 0;
        int check = 0;

        for (int i = 1; i <= nums[nums.length - 1]; i++) {
	    if (nums[count] != i) {
		    check = i;
                     break;
	     }
	    count++;
    	}   

	for (int i = 0; i < nums.length; i++) {
	    if (compareNumbers.contains(nums[i])) {
		    duplicate = nums[i];
	    } else {
		    compareNumbers.add(nums[i]);
	      }	
	}

	int[] result = new int[2];

	result[0] = duplicate;

	if (nums.length == 2 && duplicate <= 1) result[1] = duplicate + 1;
        else if (nums.length != 2 && missingNumber == nums[nums.length -1]) result[1] = missingNumber + 1;
        else if (nums.length != 2 && check < duplicate) result[1] = check;
        else if (nums.length != 2) result[1] = missingNumber;
        else result[1] = missingNumber;

	return result;

    }

    public static void main(String... args) {

	int[] d = findErrorNums(new int[]{3,2,3,4,6,5});

	System.out.println(Arrays.toString(d));
    }

}