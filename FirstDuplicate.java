import java.util.HashMap;

public class FirstDuplicate {

    public static void findFirstDuplicate(int[] arr) {

        HashMap<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!result.containsKey(arr[i])) {
                result.put(arr[i], 1);
            } else {
                System.out.println(arr[i]);
                break;
            }
        }
        // There is no duplicates
        System.out.println(-1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 9, 3, 9, 9, 6 };

        findFirstDuplicate(arr);
    }
}
