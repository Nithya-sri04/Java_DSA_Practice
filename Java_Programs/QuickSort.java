import java.util.Scanner;

public class QuickSort {
    static void quickSort(int arr[], int low, int high) {
        // code here
        if(low<high){
            int pivot = partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
        
    }

    static int partition(int arr[], int low, int high) {
        // your code here
         int pivot = arr[low];
        int i = low+1;
        int j = high;
        while(i<=j){
            while(i<=j && arr[i]<pivot){
                i++;
            }
            
            while(i<=j && arr[j]>pivot){
                j--;
            }
            
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp1 = arr[low];
        arr[low] = arr[j];
        arr[j] = temp1;
        return j;
        
    }

    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        quickSort(arr,0,n-1);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
