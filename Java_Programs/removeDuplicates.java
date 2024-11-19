import java.util.*;
public class removeDuplicates {
    public static int removeDuplicatesinArray(int[] arr){
            int j =1;
            for(int i =1;i<arr.length;i++){
                if(arr[i] != arr[i-1]){
                    arr[j] = arr[i];
                    j++;
                }
            }
            return j;  

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


        int result = removeDuplicatesinArray(A);
        System.out.println("The Length of an array after removing duplicates is:" + result);
    }
    
}
