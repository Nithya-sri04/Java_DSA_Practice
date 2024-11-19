public class FloorSortedArray {
    public static int findFloor(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;
        int floor = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
             else if(arr[mid] < target){
                floor = arr[mid];
                low = mid+1;
            }

            else{
                high = mid-1;
            }
        }
        return floor;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 6, 10};
        int target1 = 5;
        System.out.println("Floor of " + target1 +   "is: " + findFloor(arr1, target1));

        int[] arr2 = {2, 3, 5, 9, 14, 16};
        int target2 = 7;
        System.out.println("Floor of " + target2 + " is: " + findFloor(arr2, target2)); 

        int[] arr3 = {1, 3, 5, 7, 9};
        int target3 = 8;
        System.out.println("Floor of " + target3 +  " is: " + findFloor(arr3, target3));  

        int[] arr4 = {1, 3, 5, 7, 9};
        int target4 = 10;
        System.out.println("Floor of " + target4 +  " is: " + findFloor(arr4, target4));

        int[] arr5 = {10, 20, 30, 40, 50};
        int target5 = 5;
        System.out.println("Floor of " + target5 + " is: " + findFloor(arr5, target5)); 
    }
    
}
