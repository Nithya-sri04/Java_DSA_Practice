import java.util.Scanner;
import java.util.Arrays;

public class ChocolateDistribution{
    
    public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the size of an array");
       int n = sc.nextInt();
       int [] arr = new int[n];
       System.out.print("Enter Array elements");
       for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();

       }
       System.out.println("Enter m");
       int m = sc.nextInt();
       int result = minDistribution(arr,n,m);
       System.out.print(result);
    }

    public static int minDistribution(int[]arr,int n ,int m){
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0; m+i-1<n;i++){
            int difference = arr[m+i-1] - arr[i];
            if(difference<minDiff){
                minDiff = difference;
            }

        }
        return minDiff;
    }
}
