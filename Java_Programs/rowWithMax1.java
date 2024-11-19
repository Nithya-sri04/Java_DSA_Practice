import java.util.Scanner;

public class rowWithMax1 {
    public static int maxOnes(int[][] mat, int n, int m) {
        int index = -1;
        int countMax = 0;
        
        for (int i = 0; i < n; i++) {
            int countOne = m - binarySearch(mat[i], m, 1); // Number of 1s in the row
            if (countOne > countMax) {
                countMax = countOne;
                index = i;
            }
        }
        return index;
    }

    public static int binarySearch(int[] arr, int m, int x) {
        int low = 0;
        int high = m - 1;
        int ans = m;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int n = scanner.nextInt();

        System.out.println("Enter the number of columns: ");
        int m = scanner.nextInt();

        int[][] arr = new int[n][m];

        System.out.println("Enter the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int result = maxOnes(arr, n, m);
        System.out.println("Row with the maximum number of 1s: " + result);
        
        scanner.close();
    }
}
