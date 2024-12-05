/*Problem Description
Given a list of N words, find the shortest unique prefix to represent each word in the list.

NOTE: Assume that no word is the prefix of another. In other words, the representation is always possible

 

Input :First and only argument is a string array of size N.

Output: Return a string array B where B[i] denotes the shortest unique prefix to represent the ith word.

 

Example Input

Input 1:

 A = ["zebra", "dog", "duck", "dove"]

Input 2:

A = ["apple", "ball", "cat"]

 

Example Output

Output 1:

 ["z", "dog", "du", "dov"]

Output 2:

 ["a", "b", "c"]
 */

import java.util.ArrayList;
import java.util.List;

public class UniquePrefix {

    public static void findUniqueStr(String[] arr) {
        List<String> result = new ArrayList<String>();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                String currStr = arr[i];
                StringBuilder uniqueStr = new StringBuilder();
                for (int k = 0; k < currStr.length(); k++) {
                    if (currStr.charAt(k) != arr[j].charAt(k)) {
                        uniqueStr.append(currStr.charAt(k));
                        break;
                    } else {
                        uniqueStr.append(currStr.charAt(k));
                    }
                }
                result.add(uniqueStr.toString());
            }
        }

        System.out.println(result.toString());
    }

    public static void main(String[] args) {
        String[] s1 = { "zebra", "dog", "duck", "dove" };
        String[] s2 = { "apple", "ball", "cat" };
        findUniqueStr(s1);
        findUniqueStr(s2);

    }
}
