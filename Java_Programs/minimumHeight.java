import java.util.Arrays;
import java.util.Scanner;

class minimumHeight {
    static int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        if(n==1){
            return 0;
        }
        Arrays.sort(arr);
        int res = arr[n-1] - arr[0];
        int small = arr[0] + k;
        int large = arr[n-1] - k;
        
        for(int i =0;i<n-1;i++){
            int min = Math.min(small,arr[i+1]-k);
            int max = Math.max(large,arr[i]+k);
            
            if(min<0){
                continue;
            }
            
            res = Math.min(res,max-min);
        }
        
        return res;
    }

    public static void main(String[] args){
                Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        
        System.out.print("Enter k: ");
        int k = scanner.nextInt();

        System.out.println("Minimum height difference is: " + getMinDiff(arr,k));
    }
}
