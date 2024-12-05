import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum {

    public static void twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> bucket = new HashMap<>();
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (bucket.containsKey(target - arr[i])) {
                result.add(bucket.get(target - arr[i]));
                result.add(i);
                break;
            } else {
                bucket.put(arr[i], i);
            }
        }

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 3, 2, 4 };
        twoSum(arr1, 6);
    }
}