public class PeakElement {

    public static void findPeakElm(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int max = -1;
        while (left <= right) {
            if (arr[left] < arr[right]) {
                max = Math.max(max, arr[right]);
            } else {
                max = Math.max(max, arr[left]);
            }
            left++;
            right--;
        }

        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 5, 17, 100, 11 };
        findPeakElm(arr1);
        findPeakElm(arr2);

    }
}