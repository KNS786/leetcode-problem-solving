import java.util.ArrayList;
import java.util.List;

public class LongestPalindrome {

    public static void findLongestPalindromicSubString(String str) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            String res = "";
            int j = i + 1;
            while (j < str.length() && str.charAt(i) != str.charAt(j)) {
                j += 1;
            }
            int temp = j;

            for (int k = i; k <= j; k++, j--) {
                if (j == str.length()) {
                    break;
                }
                if (str.charAt(k) != str.charAt(j)) {
                    break;
                }
                res = res + str.charAt(k);
            }

            if (res.length() > 0) {
                res = res + str.charAt(temp);
                result.add(res);
            }
        }

        String longest = "";
        for (int i = 0; i < result.size(); i++) {
            if (longest.length() < result.get(i).length()) {
                longest = result.get(i);
            }
        }

        System.out.println(longest);

    }

    public static void main(String[] args) {
        findLongestPalindromicSubString("babaac");
        findLongestPalindromicSubString("bcg");

    }
}