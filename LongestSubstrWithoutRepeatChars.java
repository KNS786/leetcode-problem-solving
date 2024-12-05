import java.util.HashSet;

public class LongestSubstrWithoutRepeatChars {

    public static void LongestSubstrWithoutRepeatChar(String str) {
        int max = -1;

        HashSet<Character> charSet = new HashSet<Character>();

        int left = 0;
        for (int right = 0; right < str.length(); right++) {
            if (!charSet.contains(str.charAt(right))) {
                charSet.add(str.charAt(right));
                max = Math.max(max, right - left + 1);
            } else {
                while (charSet.contains(str.charAt(right))) {
                    charSet.remove(str.charAt(left));
                    left++;
                }
            }

            charSet.add(str.charAt(right));
        }

        System.out.println(max);
    }

    public static void main(String[] args) {
        LongestSubstrWithoutRepeatChar("abcabcbb");
    }
}
