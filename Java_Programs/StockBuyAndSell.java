import java.util.ArrayList;
import java.util.Scanner;

public class StockBuyAndSell {
     public static ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        for(int i =0;i<n-1;i++){
            ArrayList<Integer> list = new ArrayList<>();
            if( A[i+1]>A[i]){
                list.add(i);
                list.add(i+1);
                ans.add(list);
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int n = scanner.nextInt();
        int[] A = new int[n];

        System.out.println("Enter the stock prices:");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        ArrayList<ArrayList<Integer>> result = stockBuySell(A, n);

        if (result.isEmpty()) {
            System.out.println("No profit");
        } else {
            System.out.println("Buy and sell days for maximum profit:");
            for (ArrayList<Integer> pair : result) {
                System.out.println("Buy on day: " + pair.get(0) + ", Sell on day: " + pair.get(1));
            }
        }

        scanner.close();
    }

}
