import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class klargestElts{

    static List<Integer> kLargest(int arr[], int k) {
        List<Integer> result = new ArrayList<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i =0;i<arr.length;i++){
            minHeap.add(arr[i]);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        
        for(int num : minHeap){
            result.add(num);
        }
        Collections.sort(result,Collections.reverseOrder());
        return result;

        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        List<Integer> result = kLargest(arr, k);
        System.out.println("The " + k + " largest elements in descending order are: " + result);

        scanner.close();
    }

}
