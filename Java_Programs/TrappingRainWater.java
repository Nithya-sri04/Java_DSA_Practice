import java.util.Scanner;

public class TrappingRainWater {
    public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the size of an array");
       int n = sc.nextInt();
       int [] arr = new int[n];
       System.out.print("Enter Array elements");
       for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();

       }
       int result = maxArea(arr,n);
       System.out.print(result);
    }

    public static int maxArea(int[]heights,int n){
        int res = 0;
        int maxHeight = 0;
        int left = 0;
        int right = n-1;
        while(left<=right){
            if(heights[left]<=heights[right]){
                if(heights[left]>maxHeight){
                    maxHeight = heights[left];
                }
                else{
                    res += maxHeight - heights[left];
                }

                left++;
            }

            else{
                if(heights[right]>=maxHeight){
                    maxHeight = heights[right];
                }

                else{
                    res += maxHeight - heights[right];
                }

                right--;
            }
        }
        return res;
    }

    
}
