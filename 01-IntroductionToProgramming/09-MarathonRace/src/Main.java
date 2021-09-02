import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {13, 7, 6, 45, 21, 9, 2, 100};

        // Sorts arr[] in descending order using
        // reverseOrder() method of Collections class
        // in Array.sort() as an argument to it
        Arrays.sort(arr, Collections.reverseOrder());

        // Printing the array as generated above
        System.out.println(Arrays.toString(arr));
        System.out.println("second person: "+arr[1]);
        System.out.println("Third person: "+arr[2]);
    }
}
