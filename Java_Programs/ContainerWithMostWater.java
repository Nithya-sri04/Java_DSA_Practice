import java.util.*;

public class ContainerWithMostWater {
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

    public static int maxArea(int[] height,int n) {
        int maxArea = 0;
        int left = 0;
        int right = height.length-1;
        while(left<=right){

            int width = right - left;
            int height1 = Math.min(height[left],height[right]);

            maxArea = Math.max(maxArea,(width*height1));
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }

            
        }

        return maxArea;
    }
}
