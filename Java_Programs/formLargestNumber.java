import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class formLargestNumber {
    public static String printLargest(String[] arr) {
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String x, String y) {
                String xy = x + y;
                String yx = y + x;
                return yx.compareTo(xy); 
            }
        });
        
        StringBuilder result = new StringBuilder();
        for (String str : arr) {
            result.append(str);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] arr = new String[n];
        System.out.println("Enter the elements (non-negative integers as strings):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }
        String result = printLargest(arr);
        System.out.println("Largest number formed: " + result);
    }
}
