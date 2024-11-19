import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class TripletSum{

    public static List<List<Integer>> threeSum(int[] nums,int target){
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            int j = i+1;
            int k = nums.length -1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == target){
                    set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                else if(sum<target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        result.addAll(set);
        return result;
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();
        List<List<Integer>> result = threeSum(nums, target);
        System.out.println("Triplets that sum up to " + target + ":");
        if (result.isEmpty()) {
            System.out.println("No triplets found.");
        } else {
            for (List<Integer> triplet : result) {
                System.out.println(triplet);
            }
        }

        scanner.close();
    }
    
}
