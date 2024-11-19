public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int ind = -1;
        int ind2 = -1;
        int n = nums.length;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }

        if (ind == -1) {
            reverse(nums, 0);
        } else {
            for (int i = n - 1; i >= 0; i--) {
                if (nums[i] > nums[ind]) {
                    ind2 = i;
                    break;
                }
            }
            swap(nums, ind, ind2);
            reverse(nums, ind + 1);
        }
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    void reverse(int[] nums, int start) {
        int i = start;
        int j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        NextPermutation np = new NextPermutation();
        int[] nums = {1, 1, 5};
        System.out.println("Original Array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        np.nextPermutation(nums);
        System.out.println("Next Permutation:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
