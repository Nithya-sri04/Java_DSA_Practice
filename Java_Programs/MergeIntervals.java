import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MergeIntervals {

    public static List<int[]> mergeIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();
        int[] currentInterval = intervals[0];
        merged.add(currentInterval);
        for (int[] interval : intervals) {
            if(interval[0] <= currentInterval[1]){
              currentInterval[1] = Math.max(currentInterval[1],interval[1]);
            }
            else{
                currentInterval = interval;
                merged.add(currentInterval);
            }
    }

        return merged;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of intervals:");
        int n = sc.nextInt();
        int[][] intervals = new int[n][2];

        System.out.println("Enter each interval as start and end values:");
        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }

        List<int[]> result = mergeIntervals(intervals);

        System.out.println("Merged Intervals:");
        for (int[] interval : result) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }
}

