import java.util.List;
import java.util.ArrayList;

public class ProductArrayExceptSelf {

    public static void ProductArrayExceptSelfs(int[] arr) {

        int[] prefix = new int[arr.length];
        int suffix = 1;

        prefix[0] = 1;

        int[] result = new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] * arr[i - 1];
        }

        for (int j = arr.length - 1; j >= 0; j--) {
            result[j] = suffix * prefix[j];
            suffix *= arr[j];
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, 2, 3 };
        ProductArrayExceptSelfs(arr);
    }
}
