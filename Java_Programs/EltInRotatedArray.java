public class EltInRotatedArray {

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = -4;

        int index = binarySearch(nums, 0, nums.length - 1, target);
        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found");
        }
    }



    public static int binarySearch(int[] nums, int low,int high,int target){
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[low] == nums[mid] && nums[high] == nums[mid] ){
                low++;
                high--;
                continue;
            }

            if(nums[low] <= nums[mid]){
                if(nums[low] <= target && nums[mid]>target){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }

            else{
                if(nums[mid]<target && target<=nums[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }

        }

        return -1;
        

    }
    
}

