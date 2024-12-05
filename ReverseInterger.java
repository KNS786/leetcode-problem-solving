public class ReverseInterger {
    public static int ReverseInt(int num) {
        int d = num;
        if (d < 0) {
            d = -1 * d;
        }

        StringBuilder res = new StringBuilder();
        while (d > 0) {
            int rem = d % 10;
            res.append(rem);
            d = d / 10;
        }

        if (num < 0) {
            return -1 * Integer.parseInt(res.toString(), 10);

        }
        return Integer.parseInt(res.toString(), 10);

    }

    public static void main(String[] args) {
        System.out.println(ReverseInt(120));
    }
}
