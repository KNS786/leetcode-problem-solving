public class PalindromeNumber {

    public static boolean isPalindromeNumber(int num) {
        int reverse = 0;
        int d = num;

        if (d < 0) {
            return false;
        }

        while (d > 0) {
            reverse = reverse * 10 + d % 10;
            d = d / 10;
        }

        return num == reverse;

    }

    public static void main(String[] args) {
        System.out.println(isPalindromeNumber(-121));
    }
}
