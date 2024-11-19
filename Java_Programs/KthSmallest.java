import java.util.PriorityQueue;
import java.util.Scanner;

public class KthSmallest{
    public static int kthSmallestElt(int[] arr,int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b-a);
        for(int i = 0;i<arr.length;i++){
            maxHeap.add(arr[i]);

            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }
        return maxHeap.peek();
       
    }

    public static void main(String[] args) {
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

        System.out.println("Kth Smallest element: " + kthSmallestElt(arr,k));
    }

   
}
 