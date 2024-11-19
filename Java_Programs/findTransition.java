import java.util.Arrays;
import java.util.Scanner;

public class findTransition {
    public static int findTransitionPoint(int[]arr,int n){
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == 0){
                low = mid+1;
            }
            else if(arr[mid] == 1){
                if(mid == 0 || (mid>0 && arr[mid-1] == 0)){
                    return mid;
                }
                high = mid-1;
            }
        }
        return -1;
    }

     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] A = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }


        int result = findTransitionPoint(A,n);
        System.out.println("Transition point is :" + result);
    }
    
}
