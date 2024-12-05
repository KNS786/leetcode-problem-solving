public class ContainerWithMstWater {
    public static void containerWithMstWater(int[] arr) {
        int left = 0, right = arr.length - 1;
        int maxArea = -1;
        while (left < right) {
            maxArea = Math.max(
                    maxArea,
                    Math.min(arr[left], arr[right]) * (right - left));

            if (arr[left] < arr[right]) {
                left += 1;
            } else {
                right -= 1;
            }
        }

        System.out.println(maxArea);
    }

    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        containerWithMstWater(height);
    }
}
