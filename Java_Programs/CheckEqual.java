import java.util.HashMap;

public class CheckEqual {
    public static boolean areEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (int num : arr2) {
            if (!countMap.containsKey(num)) {
                return false; 
            }
            countMap.put(num, countMap.get(num) - 1);
            if (countMap.get(num) == 0) {
                countMap.remove(num); 
            }
        }
        return countMap.isEmpty();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 5, 4, 0};
        int[] arr2 = {2, 4, 5, 0, 1};
        System.out.println("Are arrays equal? " + areEqual(arr1, arr2)); 

        int[] arr3 = {1, 2, 5};
        int[] arr4 = {2, 4, 15};
        System.out.println("Are arrays equal? " + areEqual(arr3, arr4));

        int[] arr5 = {1,2,3,4};
        int[] arr6 = {4,2,3,1};
        System.out.println("Are arrays equal?" + areEqual(arr5,arr6));

        int[] arr7 = {1,2,3,4,6};
        int[] arr8 = {4,2,3,1,9,10};
        System.out.println("Are arrays equal?" + areEqual(arr7,arr8));
    }
}
