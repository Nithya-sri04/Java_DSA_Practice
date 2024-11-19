import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class unionArray {
    public static List<Integer> unionOfArray(int[] a,int[] b){
        HashSet<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for(int i =0;i<a.length;i++){
            boolean  isAdded = set.add(a[i]);
            if(isAdded){
                result.add(a[i]);
            }
        }

        for(int i =0;i<b.length;i++){
            boolean isAdded = set.add(b[i]);
            if(isAdded){
                result.add(b[i]);
          
            }
        }

       result.sort(null);
        return result;
    }

     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the array elements of A:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of elements: ");
        int m = scanner.nextInt();

        int[] b = new int[m];
        System.out.println("Enter the array elements of B:");
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }


        System.out.println("Union of two arrays is : " + unionOfArray(a,b));
    }
}
