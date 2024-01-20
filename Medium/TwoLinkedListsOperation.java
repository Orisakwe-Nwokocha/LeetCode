import java.util.Arrays;
import java.util.LinkedList;

public class TwoLinkedListsOperation {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        
	    list1.add(9);
        list1.add(9);
        list1.add(9);
        list1.add(9);
        list1.add(9);
        list1.add(9);
        list1.add(9);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(9);
        list2.add(9);
        list2.add(9);
        list2.add(9);


        LinkedList<Integer> result = addLinkedLists(list1, list2);

        System.out.println("Result of addition: " + result);
    }

    public static LinkedList<Integer> addLinkedLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> result = new LinkedList<>();

        if (list1.size() > list2.size()) {
            int[] array = new int[list1.size()];

            for (int i = 0; i < list2.size(); i++) {
                array[i] =  list2.get(i);
            }

            for (int i = array.length - list2.size() + 1; i < array.length; i++) {
               list2.add(array[i]);
            }
        }
	
	    else if (list2.size() > list1.size()) {
            int[] array = new int[list2.size()];

            for (int i = 0; i < list1.size(); i++) {
                array[i] =  list1.get(i);
            }

            for (int i = array.length - list1.size() + 1; i < array.length; i++) {
                list1.add(array[i]);
            }
        }

	    int reverse1 = 0;
	    int reverse2 = 0;

	    for (int i = list1.size() - 1; i >= 0; i--) {
		    reverse1 = (reverse1 * 10) + list1.get(i);
		    reverse2 = (reverse2 * 10) + list2.get(i);
	    }

        int sum = reverse1 + reverse2;
        String s = String.valueOf(sum);

        for (int i = 0; i < s.length(); i++) {
            result.add(sum % 10);
            sum /= 10;
        }

        return result;
    }
}
