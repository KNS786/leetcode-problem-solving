import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static void mergeIntervals(int[][] intervals) {

        // Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();
        int i = 0;

        while (i < intervals.length - 1) {

            int end = intervals[i][1];

            int j = i + 1;
            int currentElm = intervals[j][1];
            while (j < intervals.length) {
                int start = intervals[j][0];
                if (end >= start) {
                    currentElm = intervals[j][1];
                    j++;
                } else {
                    break;
                }
            }

            result.add(new int[] { intervals[i][0], currentElm });
            i = j;
        }
        int n = result.size();
        int m = result.get(0).length;

        int[][] ans = new int[n][m];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                ans[row][col] = result.get(row)[col];
            }
        }

        // print loop
        for (int row = 0; row < ans.length; row++) {
            for (int col = 0; col < ans[row].length; col++) {
                System.out.print(ans[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] intervals = {
                { 1, 3 },
                { 2, 6 },
                { 8, 10 },
                { 15, 18 }
        };
        mergeIntervals(intervals);
    }
}
