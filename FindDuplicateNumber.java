import java.util.HashMap;

public class FindDuplicateNumber {

    public static int findDuplicateNumber(int[] arr) {
        HashMap<Integer, Integer> store = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!store.containsKey(arr[i])) {
                store.put(arr[i], 1);
            } else {
                return arr[i];
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 2 };

        System.out.println(findDuplicateNumber(arr));
    }
}
