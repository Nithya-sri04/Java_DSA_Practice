import java.util.Scanner;

public class equilibriumPnt {
    public static int equilibriumPoint(int arr[]) {
       int n = arr.length;
       if(n == 1){
           return 1;
       }
       int[] prefixSum = new int[n];
       int[] suffixSum = new int[n];
       prefixSum[0] = arr[0];
       for(int i = 1;i<n;i++){
           prefixSum[i] = prefixSum[i-1] + arr[i];
       }
       
        suffixSum[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + arr[i];
        }
        
        for(int i =0;i<n;i++){
            if(prefixSum[i] == suffixSum[i]){
                return i+1;
            }
        }
        
        return -1;
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


        System.out.println("Equilibrium point is : " + equilibriumPoint(arr));
    }
}
