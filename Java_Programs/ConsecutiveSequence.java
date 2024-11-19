import java.util.HashSet;
import java.util.Scanner;

public class ConsecutiveSequence {
    public static int longestConsecutiveSequence(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int maxCount = 0;

        for (int num : arr) {
            if (!set.contains(num - 1)) {
                int x = num;
                int count = 1;

                while (set.contains(x + 1)) {
                    x = x + 1;
                    count++;
                }

                maxCount = Math.max(count, maxCount);
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int result = longestConsecutiveSequence(nums);
        System.out.println("The length of the longest consecutive subsequence: " + result);

        scanner.close();
    }
}
