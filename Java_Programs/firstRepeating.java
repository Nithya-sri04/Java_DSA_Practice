import java.util.HashMap;
import java.util.Scanner;

public class firstRepeating {
    public static int firstRepeated(int[] arr) {
       
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i =0;i<arr.length;i++){
            if(map.get(arr[i])>1){
                return i+1;
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


        int result = firstRepeated(A);
        System.out.println("The index of first repeated element is :" + result);
    }
}
