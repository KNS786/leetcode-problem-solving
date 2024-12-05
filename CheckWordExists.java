/*
 problem description
 
 Given a sentence that consists of some words separated by a single space, and a searchWord, check if searchWord is a prefix of any word in sentence.

Return the index of the word in sentence (1-indexed) where searchWord is a prefix of this word. If searchWord is a prefix of more than one word, return the index of the first word (minimum index). If there is no such word return -1.

A prefix of a string s is any leading contiguous substring of s.

 

Example 1:

Input: sentence = "i love eating burger", searchWord = "burg"
Output: 4
Explanation: "burg" is prefix of "burger" which is the 4th word in the sentence.
Example 2:

Input: sentence = "this problem is an easy problem", searchWord = "pro"
Output: 2
Explanation: "pro" is prefix of "problem" which is the 2nd and the 6th word in the sentence, but we return 2 as it's the minimal index.
Example 3:

Input: sentence = "i am tired", searchWord = "you"
Output: -1
Explanation: "you" is not a prefix of any word in the sentence.
 */

public class CheckWordExists {

    public static int findWordInPrefixIndex(String sentance, String target) {

        /* approch 1 */
        // String[] arr = sentance.split(" ");
        // for (int i = 0; i < arr.length; i++) {
        // String currStr = arr[i];
        // boolean isMatched = true;
        // for (int j = 0; j < target.length(); j++) {
        // if (currStr.charAt(j) != target.charAt(j)) {
        // isMatched = false;
        // break;
        // }
        // }
        // if (isMatched) {
        // return i + 1;
        // }
        // }

        {
            /* approch 2 */}
        String[] arr = sentance.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String currWord = arr[i];
            if (currWord.startsWith(target)) {
                return i + 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        String s1 = "this problem is an easy problem";
        String search = "pro";
        System.out.println(findWordInPrefixIndex(s1, search));

    }
}
