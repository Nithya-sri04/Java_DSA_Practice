import java.util.*;

public class MaximumSubArrayProduct{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size");
        int n = sc.nextInt();
        int[] arr = new int[n]; 
        System.out.println("Enter Array elements");
        for (int i = 0; i < n; i++) { 
            arr[i] = sc.nextInt();
        }
        int result = maximumSubArrayProduct(arr, n);
        System.out.println("Maximum Subarray Product: " + result);
    }

    public static int maximumSubArrayProduct(int[] a, int n) {
        int maxProduct = a[0];
        int prefix = 1;
        int suffix = 1;
        
        for (int i = 0; i < n; i++) {
            
           if(prefix == 0) prefix = 1;
           if(suffix == 0) suffix = 1;
            
            prefix *= a[i];
            suffix *= a[n - i - 1];
            
            maxProduct = Math.max(maxProduct, Math.max(prefix, suffix));
        }
        
        return maxProduct;
    }
}


